package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario user = em.find(Usuario.class, 6L);
		user.setEmail("tempestade@storm.com");
		user.setNome("Storm");
		
//		em.merge(user);

		em.getTransaction().commit();

		System.out.println(user.getEmail());

		em.close();
		emf.close();
	}
	
	/*
	 * Neste exemplo retiramos o camando merge() que é o responsável por fazer o update no
	 * banco de dados, mas a alteração foi realizada da mesma forma. Isso ocorre porque 
	 * colocamos o objeto USER em um contexto transacional o que a deixa em um estado
	 * gerenciado, capaz de sofrer modificações mesmo sem o merge() colocando em risco a 
	 * integridade do BD por causa de alterações acidentais ou maliciosas que podem ocorrer.
	 * Neste estado gerenciado o JPA busca fazer a sincronização das alterações com o banco
	 * de dados, o que pode ocorrer nao necessárimente no mesmo instante da modificação, mas
	 * em um momento qundo ocorrer essa sincronização.
	 * Podemos contornar esse contexto transacional utilizando o método detach associado ao
	 * EntityManeger que retira o objeto desse estado gerenciado dando mais segurança aos
	 * dados. Este será mostrado no exercicio AlterarUsuario3.
	 * ==> Dvemos priorizar para trabalhar sempre fora desse estado gerenciado e somente quando
	 * for persistir o dado, explicitar o comando para execução.
	 * 
	 */
}
