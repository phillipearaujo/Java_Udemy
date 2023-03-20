package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 3499.99, 0.35, true);
		Produto p2 = new Produto("iPad", 2950.99, 0.1, true);
		Produto p3 = new Produto("Monitor", 499.99, 0.15, false);
		Produto p4 = new Produto("MacBook", 9499.99, 0.3, true);
		Produto p5 = new Produto("Cadeira Gamer", 850.99, 0.3, true);
		Produto p6 = new Produto("Desktop", 1890.50, 0.29, true);
		
		List<Produto> prod = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		Predicate<Produto> desconto = p -> p.desconto >= 0.3;
		Predicate<Produto> frete = p -> p.freteGratis;
		Function<Produto, String> promocao = p -> p.nome + " de R$" + p.preco + 
				" com super promoção e frete grátis.";
		
		prod.stream()
			.filter(desconto)
			.filter(frete)
			.map(promocao)
			.forEachOrdered(System.out::println);
		
		
	}

}
