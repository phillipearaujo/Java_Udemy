package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		/* para definir o tipo de dado que será armazenado na lista, colocamos entre < > o tipo . 
		 * Executando o programa veremos no console os valores adicionados de forma aleatória.
		*/
		Set<String> listaAprovados = new HashSet<>();
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		listaAprovados.add("Ana");
		
		for(String candidatos: listaAprovados) {
			System.out.println(candidatos);
		}
		System.out.println("\n================\n");

	// utilizando TreeSet conseguimos ordenar a lista por ordem alfabética
		
		TreeSet<String> listaCandidatos = new TreeSet<>();
		listaCandidatos.add("Tomas");
		listaCandidatos.add("Mara");
		listaCandidatos.add("Luan");
		listaCandidatos.add("João");
		listaCandidatos.add("André");
		
		for(String aprovados: listaCandidatos) {
			System.out.println(aprovados);
		}
		System.out.println("\n================\n");

	// utilizando SortedSet ordenamos por ordem de inserção
		
		SortedSet<String> listaCandidato = new TreeSet<>();
		listaCandidato.add("Edu");
		listaCandidato.add("José");
		listaCandidato.add("Claudia");
		listaCandidato.add("Marcos");
		
		for(String aprovados1: listaCandidato) {
			System.out.println(aprovados1);
		}
		System.out.println("\n================\n");

		
		Set<Integer> nums = new HashSet<>();
		nums.add(56);
		nums.add(5);
		nums.add(6);
		nums.add(90);
		
		for(Integer a : nums) {
			System.out.print("[" + a + "]" + " ");
		}
		
	}

}
