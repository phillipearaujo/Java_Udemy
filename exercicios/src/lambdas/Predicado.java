package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				prod -> (prod.preco * (1 - prod.desconto)) >= 750;
				
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));
		
		/*
		 * Predicate é mais uma das interfaces funcionais disponíveis no java.util.function
		 * Esta recebe apenas 1 único parâmetro retornando true ou false. Predicate<T>
		 * Neste exemplo foi passado 'Produto' como parametro para verificar se é caro utilizando
		 * o predicado isCaro juntamente com a função .teste
		 * 
		 */
	}

}
