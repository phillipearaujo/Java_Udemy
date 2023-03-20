package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		
		HashSet conjunto = new HashSet();
		
		/*
		 * Nenhum tipo de colections aceita tipos primitivos. Então ele convete
		 * de forma automática para uma classe utilizando os wrappers.
		 * 
		 * CARACTERISTICAS DO SET
		 * Pode ser heterogêneo :(
		 * Pode ser homogêneo :)
		 * Não aceita objetos duplicados
		 * Poder ser ordenado
		 * não é indexado (os itens não possuem uma posição fixa)
		 */
		
	// adicionar valores usa .add
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String já é uma classe
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character
		
		System.out.println("Tamanho é " + conjunto.size()); // usando .size verifica o tamanho do set
		
		conjunto.add("Teste"); // não adicionou o valor repetido. 
		conjunto.add("teste"); // este foi adicionado devido diferenciação da primeira letra
		System.out.println("Tamanho é " + conjunto.size());
		
	// remover valores usa .remove
		System.out.println(conjunto.remove("teste")); // caso o valor seja removido será retornado o valor true
		System.out.println(conjunto.remove('X')); // caso contrário; retorna false
		System.out.println(conjunto.remove("Teste"));
		
		System.out.println("Tamanho é " + conjunto.size());
		
	// fazer busca dentro do set utiliza .contains
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains("teste")); // retornou false porque valor já foi removido
		
		
		HashSet nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
	// é possível unir os conjuntos utilizando .addAll / Para testar comente a linha 63 e execute o programa
	//conjunto.addAll(nums);
		
	// também é possível fazer a interceção entre os conjuntos para verificar apenas itens em comum com .retainAll
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
	// para apagar o conjunto usamos .clear / Executando o programa o valor será vazio
		conjunto.clear();
		System.out.println(conjunto);
		
		
		
		
		
	}

}
