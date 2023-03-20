package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2)-> (n1 + n2)/2;
		System.out.println(media.apply(9.8, 5.7));
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(media.andThen(conceito).apply(9.8, 5.7));
	
		System.out.println("===================");
		
		BiFunction<Double, Double, String> resultado1 = 
				(n1, n2)-> ((n1 + n2)/2) >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado1.apply(9.8, 5.7));

		System.out.println("===================");
		
		BiFunction<Double, Double, String> resultado2 = (n1, n2)->{
				double notaFinal = (n1 + n2)/2; 
				System.out.println(notaFinal);
				return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
				System.out.println(resultado2.apply(9.8, 5.7));
				
	/*
	 * Neste exemplo utilizamos novamente a function BinaryOperator que recebe 2 objetos de um tipo
	 * e retorna 1 objeto do mesmo tipo (Double > Double, Integer > Integer) para calcular a média. 
	 * A função recebeu 2 valores Double e retornou 1 valor Double. Imediatamente utilizamos a
	 * Function que recebeu o valor Double e retornou uma String.
	 * 
	 * Na linha 20 vimos uma nova função que faz o ppapel da 2 anteriores recebendo 2 valores do 
	 * tipo Double e retornando uma String. BiFunction<T, U, R>
	 * Vimos também 2 maneiras de implementação utilizando BiFunction para obter o mesmo resultado.
	 * 
	 */
	
	}
}
