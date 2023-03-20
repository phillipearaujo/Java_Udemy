package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		String jpql = "SELECT u FROM Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(4);

		List<Usuario> usuarios = query.getResultList();

		for (Usuario usuario : usuarios) {
			System.out.println("ID:" + usuario.getId() + " " + 
							   "E-mail: " + usuario.getEmail());
		}

		em.close();
		emf.close();
	}
	
	/*
	 * Neste exemplo realizamos uma busca utilizando o JPQL que utiliza linguagem próxima a do
	 * MySQL para realizar suas query's. Apenas por meio dela conseguimos obter uma lista de
	 * retorno como no exemplo acima.
	 * => Deve-se tomar o cuidado ao utilizar este modelo, poi caso tenha um banco de dados
	 * muitos registros, este vai retornar 100% da pesquisa podendo até derrubar a aplicação.
	 * Para que isso não ocorra utilize funções para especificar a pesquisa como por exemplo
	 * quantos resultados obter ou um intervalo de resultados por meio da chave primaria.
	 */
}
