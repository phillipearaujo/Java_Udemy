package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Usuario user = em.find(Usuario.class, 1L);

		em.detach(user);
		
		user.setEmail("xavier@charles.com");
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	/*
	 * Como comentado no exercicio anterior a função detach() retira o objeto do modo 
	 * gerenciado garantindo que o objeto só será persistido(alterado) se for explicitamente 
	 * solicitado.
	 */
}
