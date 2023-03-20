package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		//O principal conceito de Map é: É uma estrutura CHAVE / VALOR
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		//usamos .put para adicionar valores. O mesmo método adiciona quando não existe o valor e 
		//atualiza quando ja possui.
		
		usuarios.put(1, "João");
		usuarios.put(1, "Roberto");
		System.out.println(usuarios.size()); //vimos no console que tem apenas 1 valor inserido
		System.out.println("==========================");
		
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println("==========================");
		
		System.out.println(usuarios.keySet()); // mostra a lista de chaves associadas
		System.out.println(usuarios.values()); // mostra apenas os valores de cada chave
		System.out.println(usuarios.entrySet()); // mostra chave e valor 
		System.out.println("==========================");
		
		System.out.println(usuarios.containsKey(20)); // realiza pesquisa por meio da chave
		System.out.println(usuarios.containsValue("Rebeca")); // realiza pesquisa por meio do valor
		System.out.println("==========================");
		
		System.out.println(usuarios.get(4)); // retorna o valor a partir da chave
		System.out.println(usuarios.get(1));
		System.out.println("==========================");
		
		/*
		 * Abaixo temos as 3 formas de percorrermos o mapa.
		 * Primeiro através da chave utilizando .keyset
		 * Segundo percorremos através dos valores utilizando .values
		 * Terceiro percorremos por meio da cheve e valor utilizando Entry<k, v> importando java.util.Map
		 */
		
		for(Integer chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		System.out.println("==========================");
		
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		System.out.println("==========================");
		
		for(Entry<Integer, String> usuario: usuarios.entrySet()) {
			System.out.print(usuario.getKey() + " => ");
			System.out.println(usuario.getValue());
		}
		System.out.println("==========================");
		
		usuarios.remove(1); // remove utilizando como referencia a chave. Roberto foi removido.
		System.out.println(usuarios.entrySet()); 
		System.out.println("==========================\n");

		usuarios.remove(4, "Rafaela"); //remove utilizando a comparação de chave e valor, ambos precisam ser correspondentes
		System.out.println(usuarios.values()); //Neste caso Rafaela não pertence a chave 4. Não será removido.
		System.out.println(usuarios.entrySet()); 
		
		
		}
		
	}


