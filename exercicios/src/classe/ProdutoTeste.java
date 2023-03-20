package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.produto = "Notebook";
		p1.preco = 4000.00;
		
		Produto.desconto = 0.50;//dessa forma conseguimos alterar o desconto de todos os produtos simultaneamente.
		
		var p2 = new Produto("Caneta Preta", 5.00);
		
		//double p1Final = p1.precoComDesconto();
		double p2Final = p2.precoComDesconto(0);
		double mediaCarrinho = (p1.precoComDesconto() + p2Final) / 2;
		
		System.out.printf("O valor final do %s é R$%.2f.",p1.produto, p1.precoComDesconto());
		System.out.printf("\n\nO valor final do %s é R$%.2f.",p2.produto, p2Final);
		System.out.printf("\n\nO valor médio da compra é R$%.2f.", mediaCarrinho);
	
	}

}
