package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Pedido pedido = new Pedido();
		Produto produto = new Produto("PC Gamer", 2789.99);
		ItemPedido item = new ItemPedido(pedido, produto, 10);
		
		dao
		.openTransaction()
		.include(produto)
		.include(pedido)
		.include(item)
		.closeTransaction()
		.close();
	}
}
