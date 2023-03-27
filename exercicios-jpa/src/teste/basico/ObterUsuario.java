package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 5L);
		System.out.println(usuario.getNome());
		
		em.close();
		emf.close();
	}
	
	/*
	 * => Para obtermos um usu�rio do banco de dados n�o precisamos dos m�todos getTrasaction()
	 * porque n�o ser� realizado nenhuma altera��o no banco. Apenas uma consulta em que 
	 * utiliza-se o m�todo find() que recebe os par�metros de busca.
	 * => Como todo acesso ao banco � necess�rio a cria��o do EntityManagerFactory e 
	 * EntityManager. Estes podem ser encapsulados em um DAO(m�todo) para agilizar a 
	 * codifica��o em um projeto uma vez que ser�o sempre reutilizados.
	 */
}
