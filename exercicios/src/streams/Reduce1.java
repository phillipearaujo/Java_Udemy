package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		Integer total1 = nums.stream().reduce(soma).get();
		System.out.println(total1);
			// reduce também é uma função terminal assim como forEach(), então é necessário
			// a chamada do get() para obter o resultado atribuindo-o a uma variável  

		Integer total2 = nums.stream().reduce(100, soma);
		System.out.println(total2);
			// passando valor inicial dentro de reduce() ele atribui o valor apenas a 
			// primeira repetição quando utilizado stream. Não há necessidade de chamar get()

		Integer total3 = nums.parallelStream().reduce(100, soma);
		System.out.println(total3);
			// passando valor inicial dentro de reduce() ele atribui o valor a cada uma das 
			// repetiçoes quando utilizado parallelStream. Não há necessidade de chamar get()
		
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
			/* outra opção é utilizar outras funções de streams juntamente com reduce()
			 * lendo o código acima temos: tendo na lista número > que 5 faça a soma e, 
			 * estando presente o resultado da função lambda em filter() imprima na saida. 
			 * Para testar altere o valor 5 e execute. 
			*/

	}
}
