package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois.andThen(vezesDois)
						.andThen(aoQuadrado).apply(0);
		System.out.println(resultado1);
		
		int resultado2 = aoQuadrado.compose(vezesDois)
						.compose(maisDois).apply(0);
		System.out.println(resultado2);
		
	/*
	 * A function UnaryOperator recebe um objeto e retorna um objeto do mesmo tipo. UnaryOperator<T>
	 * Essa característica facilita o encadeamento pois devemos lembrar que o resultado de uma função 
	 * tem que ser obrigatóriamente ser o tipo de entrada da próxima.
	 * Vimos mais uma vez o uso de andThen encadeando as 3 funções e conhecemos agora o compose
	 * que trás o mesmo resultado mas fazendo o caminho inverso.
	 * 
	 */
	}
}
