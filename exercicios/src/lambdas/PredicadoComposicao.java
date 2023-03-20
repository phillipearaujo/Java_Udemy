package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num %2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.test(24));
		System.out.println(isTresDigitos.test(1050));	
		
		System.out.println(isPar.and(isTresDigitos).negate().test(123));
		System.out.println(isPar.or(isTresDigitos).test(123));
		
		/*
		 * Utilizando a function Predicate também conseguimos fazer um encadeamento.
		 * Nesta utilizamos os operadores lógicos e, ou e nagação (and, or e negate) para 
		 * manipular mos os resultados.
		 * Na linha 15 foi questionado se o numero 123 é par .and tem 3 dígitos. O resultado
		 * claramente seria false, mas como utilizamos o operador .nagate temos um resultado true.
		 * Já na linha 16 questionamos se o número 123 é par .or tem 3 dígitos. Neste caso true.
		 * 
		 */
		
	}
}
