package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		ClienteFilter c1 = new ClienteFilter("Mario", 352.89, false);
		ClienteFilter c2 = new ClienteFilter("Joana", 152.90, true);
		ClienteFilter c3 = new ClienteFilter("Aline", 567.20, true);
		ClienteFilter c4 = new ClienteFilter("José", 99.80, false);
		ClienteFilter c5 = new ClienteFilter("Ariane", 421.89, true);
		ClienteFilter c6 = new ClienteFilter("Alan", 144.99, false);
		
		List<ClienteFilter> clientes = Arrays.asList(c1,c2,c3,c4,c5,c6);
		
		Predicate<ClienteFilter> valorCompra = c -> c.valorCompra > 150;
		Predicate<ClienteFilter> formaPgto = c -> c.pagamentoAVista;
		Function<ClienteFilter, String> brinde = c -> 
							"Caro cliente " + c.nome + " estamos "
							+ "encaminhando o seu brinde surpresa!!!"; 
		
		
		clientes.stream()
			.filter(valorCompra)
			.filter(formaPgto)
			.map(brinde)
			.forEach(System.out::println);
		
		
		
	}
}
