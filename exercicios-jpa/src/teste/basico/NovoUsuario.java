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
	 * => O EntityManagerFactory � o respons�vel por criar conex�o com o banco de dados por
	 * meio das informa��es contidas no arquivo persistence.xml que guarda as chaves de acesso
	 * ao banco(url, user e password) identificado neste caso na unidade de persistencia
	 * com o nome exercicios-jpa(nome do projeto).
	 * => O EntityManager participa dessa conex�o e tambem � o respons�vel pelo CRUD no banco.
	 * => Toda altera��o que for necess�ria no banco(adicionar, editar e deletar) deve estar
	 * contida em um meio transacional que pode ser identificado pelo m�todo getTransaction()
	 * iniciando com o m�todo begin() e confirmando a altera��o com o m�todo commit().
	 * => Entre os m�todos getTransaction() est� o m�todo que far� a persistencia, no caso
	 * deste exemplo a cria��o do registro no banco de dados. persist()
	 */
}
