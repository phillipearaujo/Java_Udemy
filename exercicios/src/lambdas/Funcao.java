package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
				numero -> numero %2 == 0 ? "Par" : "Impar";
		System.out.println(parOuImpar.apply(31));
		
		Function<String, String> oResultadoE = 
				valor -> "O resultado é " + valor;
				
		Function<String, String> empolgado = 
				valor -> valor + "!!!";
				
		Function<String, String> duvida = 
				valor -> valor + "???";
				
		String resultadoFinal1 = parOuImpar.andThen(oResultadoE)
								.andThen(empolgado).apply(40);
		
		System.out.println(resultadoFinal1);
		
	/*
	 * Function é mais uma das interfaces funcionais disponíveis no java.util.function
	 * Esta recebe 1 parâmetro e o retorno definido pelo desenvolvedor. Function<T, R>
	 * Neste exemplo na primeira função na linha 9 a Function 'parOuImpar' recebeu um número
	 * inteiro e retornou uma String utilizando o operador ternário ficando ...
	 * se número módulo 2 == 0 , retorna Par se não retorna Impar.
	 * 
	 * Nas linhas 13 e 16 foram criadas novas funções que recebem o retorno da função anterior,
	 * isso se chama encadeamento. Dessa forma ficou em sequencia: empolgado recebe oResultadoE que 
	 * recebe parOuImpar.
	 * 
	 * Na linha 19 criamos a variável resultadoFinal onde utilizamos todas as funções para um
	 * resultado no console utilizando andThen que traduzindo fica 'e então'. a Expressão ficou: o
	 * resultadoFinal é igual 'parOuImpar' e então chame 'oResultadoE' e então chame 'empolgado '
	 * para o valor 40.
	 * 
	 * Utilizando pequenas funções podemos criar uma nova função para gerar um resultado diferente 
	 * aproveitando as demais funções existentes como faremos abaixo substituindo a função 
	 * 'empolgado' pela função 'duvida' criada na linha 19
	 * 
	 */
		String resultadoFinal2 = parOuImpar.andThen(oResultadoE)
								.andThen(duvida).apply(37);

		System.out.println(resultadoFinal2);
		
	}
}
