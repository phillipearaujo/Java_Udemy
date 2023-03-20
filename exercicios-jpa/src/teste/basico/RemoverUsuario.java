package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		Usuario user = em.find(Usuario.class, 9L);

		if (user != null) {
			em.getTransaction().begin();
			em.remove(user);
			em.getTransaction().commit();
			System.out.println("Usu�rio exclu�do com sucesso!");
		} else {
			System.out.println("Usu�rio n�o localizado no banco de dados!");
		}

		em.close();
		emf.close();
	}

	/*
	 * Neste exemplo utilizamos elementos comuns aos exercicios anteriores
	 * adicionando o m�todo remove() que � o respons�vel por realizar a exclus�o do
	 * registro selecionado. Vimos tamb�m que podemos utilizar os m�todos dentro do
	 * if(){} para realizarmos testes de compatibilidade na busca.
	 */
}
