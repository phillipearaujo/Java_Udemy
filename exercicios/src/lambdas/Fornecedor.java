package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		Supplier<List<String>> umLista = 
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
				
			System.out.println(umLista.get());
			
	/*
	 * A função Supplier(fornecedor) não recebe nunhum parâmetro e retorna algo. Supplier<T>
	 * No exemplo acima foi passado para retorno uma lista de String.
	 * 
	 * Quando implementamos a função lambda utilizamos os parentese () vazios pois como informado
	 * não havia nenhum parametro. Nas funções lambdas tem 2 ocasiões em que somos obrigados o 
	 * utilizar os parenteses(). Quando não temos nenhum parametro e quando temos mais de
	 * um parâmetro.
	 */
			
	}
}
