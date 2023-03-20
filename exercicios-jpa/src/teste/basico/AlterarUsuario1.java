package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 4L);
		
		usuario.setNome("Volverine");
		usuario.setEmail("logan@volverine.com.br");
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		System.out.println(usuario.getNome());
		
		em.close();
		emf.close();
	}
	
	/*
	 * Neste exemplo fixemos um update realizando a query pelo id. Utilizamos o mesmo m�todo
	 * usado no exerc�cio ObterUsuario para fazer a busca e depois utilizamos o setNome() e
	 * setEmail() para inseriri os novos valores. Para persistir as altera��es � preciso
	 * utilizar o m�todo merge() que � o respons�vel por fazer a atualiza��o.
	 * => Lembrando que sempre que formos fazer qualquer altera��o no banco de dados temos que
	 * utilizar getTransaction() para colocar o objeto em estado gerenci�vel. 
	 */
}
