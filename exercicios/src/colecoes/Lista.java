package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		/*
		 * CARACTERISTICAS DO LIST
		 * 
		 * Pode ser heterogêneo :(
		 * Pode ser homogêneo :)
		 * Aceita objetos duplicados
		 * É ordenado por inserção
		 * É indexado (possui indice permitindo a busca)
		 */
		
		ArrayList<ListaUsuario> lista = new ArrayList<>();
		
		ListaUsuario u1 = new ListaUsuario("Ana");
		lista.add(u1);
		
		lista.add(new ListaUsuario("Carlos"));
		lista.add(new ListaUsuario("Lia"));
		lista.add(new ListaUsuario("Bia"));
		lista.add(new ListaUsuario("Manu"));
		lista.add(new ListaUsuario("Manu")); //nome duplicado é aceito
		
		System.out.println("Nome no indice 3: " + lista.get(3).nome); // consegue acessar pelo indice
		
		System.out.print("\n================\n");
	
		System.out.println("Delete " + lista.remove(1).nome); // dessa forma exclui pela posição no indice retornando o nome do ojeto removido.
		System.out.println("Delete " + lista.remove(new ListaUsuario("Manu"))); // dessa forma retorna resultado boolean
		
		System.out.print("\n================\n");

		System.out.println("Tem? " + lista.contains(u1));
		System.out.println("Tem? " + lista.contains(new ListaUsuario("Carlos")));
		
		System.out.print("\n================\n");
		
		for(ListaUsuario u : lista) {
			System.out.println(u.nome);

		}
		
		// As buscas foram possíveis pois criamos os metodos hashCode() e equals() na classe usuário
		// clicar com direito -> Source -> Generate hashCode() e equals()
		
	}

}
