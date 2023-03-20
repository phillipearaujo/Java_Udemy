package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		Produto product = new Produto("Monitor 23", 789.99);
		dao.includeAtomic(product).close();
		
		System.out.println("ID new product: " + product.getId());
	}
}
