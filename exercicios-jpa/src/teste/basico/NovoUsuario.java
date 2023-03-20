package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		Usuario novoUsuario = new Usuario("Noturno", "nocturnal@ficticio.com");

		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();
		
		System.out.println(novoUsuario.getId());

		em.close();
		emf.close();
	}
	
	/*
	 * Neste primeiro exemplo criamos uma nova tabela no banco de dados usando o JPA/Hibernate.
	 * 
	 * => O EntityManagerFactory é o responsável por criar conexão com o banco de dados por
	 * meio das informações contidas no arquivo persistence.xml que guarda as chaves de acesso
	 * ao banco(url, user e password) identificado neste caso na unidade de persistencia
	 * com o nome exercicios-jpa(nome do projeto).
	 * => O EntityManager participa dessa conexão e tambem é o responsável pelo CRUD no banco.
	 * => Toda alteração que for necessária no banco(adicionar, editar e deletar) deve estar
	 * contida em um meio transacional que pode ser identificado pelo método getTransaction()
	 * iniciando com o método begin() e confirmando a alteração com o método commit().
	 * => Entre os métodos getTransaction() está o método que fará a persistencia, no caso
	 * deste exemplo a criação do registro no banco de dados. persist()
	 */
}
