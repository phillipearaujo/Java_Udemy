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
	 * => Para obtermos um usuário do banco de dados não precisamos dos métodos getTrasaction()
	 * porque não será realizado nenhuma alteração no banco. Apenas uma consulta em que 
	 * utiliza-se o método find() que recebe os parâmetros de busca.
	 * => Como todo acesso ao banco é necessário a criação do EntityManagerFactory e 
	 * EntityManager. Estes podem ser encapsulados em um DAO(método) para agilizar a 
	 * codificação em um projeto uma vez que serão sempre reutilizados.
	 */
}
