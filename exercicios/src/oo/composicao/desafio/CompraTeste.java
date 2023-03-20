package oo.composicao.desafio;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("caneta", 1, 100);
		compra1.adicionarItem(new Produto("Notebook",2000), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem("Impressora", 1000, 1);
		
		Cliente cliente = new Cliente("Maria Júlia");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println("R$" + compra1.obterValorTotalCompra());
		System.out.println("R$" + compra2.obterValorTotalCompra());
		System.out.println();
		System.out.println("O cliente " + cliente.nome + 
				"\nrealizou compra no valor total de "
				+ "R$" + cliente.obterValorTotalCliente());
		
	}

}