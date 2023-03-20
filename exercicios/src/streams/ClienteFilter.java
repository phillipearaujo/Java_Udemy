package streams;

public class ClienteFilter {

	final String nome;
	final double valorCompra;
	final boolean pagamentoAVista;
	
	public ClienteFilter(String nome, double valorCompra, 
			boolean pagamentoAVista) {
		this.nome = nome;
		this.valorCompra = valorCompra;
		this.pagamentoAVista = pagamentoAVista;
	}
	
}
