package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class DAO<E> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		} catch (Exception e) {
			// logar log4j
		}
	}

	public DAO() {
		this(null);
	}

	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}

	public DAO<E> openTransaction() {
		em.getTransaction().begin();
		return this;
	}

	public DAO<E> closeTransaction() {
		em.getTransaction().commit();
		return this;
	}

	public DAO<E> include(E entidade) {
		em.persist(entidade);
		return this;
	}

	public DAO<E> includeAtomic(E entidade) {
		return this.openTransaction().include(entidade).closeTransaction();
	}

	public List<E> getAll() {
		return this.getAll(10, 0);
	}

	public List<E> getAll(int amount, int range) {
		if (classe == null) {
			throw new UnsupportedOperationException("Class null.");
		}
		String jpql = "SELECT e FROM " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(amount);
		query.setFirstResult(range);
		return query.getResultList();
	}

	public E getById(Object id) {
		return em.find(classe, id);
	}

	public DAO<E> updateUser() {
		Usuario user = em.find(Usuario.class, 7L);
		user.setNome("Volverine");
		user.setEmail("logan@volverine.com.br");
		em.merge(user);
		return this;
	}

	public DAO<E> updateAtomic() {
		return this.openTransaction().updateUser().closeTransaction();
	}

	public void removeUser() {
		Usuario user = em.find(Usuario.class, 7L);
		if (user != null) {
			em.remove(user);
		}
	}

	public List<E> consultar(String nomeConsulta, Object... params) {
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);

		for (int i = 0; i < params.length; i += 2) {
			query.setParameter(params[i].toString(), params[i + 1]);
		}
		return query.getResultList();
	}

	public E consultarUm(String nomeConsulta, Object... params) {
		List<E> lista = consultar(nomeConsulta, params);
		return lista.isEmpty() ? null : lista.get(0);
	}

	public void close() {
		em.close();
	}

}
