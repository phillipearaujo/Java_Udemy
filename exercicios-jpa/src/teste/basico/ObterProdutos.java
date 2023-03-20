package teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {

		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> productsList = dao.getAll();

		for (Produto product : productsList) {
			System.out.println("ID: " + product.getId() + " ==> Name: " + 
										product.getNome());
		}

		double totalPrice = productsList
				.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t, p) -> t + p)
				.doubleValue();
		System.out.println("Total value of products: R$" + totalPrice);

		dao.close();
	}
}
