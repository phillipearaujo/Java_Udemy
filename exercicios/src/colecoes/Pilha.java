package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	//O principal conceito da Pilha é: O PRIMEIRO A ENTRAR SERÁ O ÚLTIMO A SAIR.
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Principe");
		livros.push("Dom Quixote");
		livros.push("O Hobbit"); //como este foi o último valor a entrar na pilha ele será visualizado primeiro no console
		
		System.out.println(livros.peek()); 
		System.out.println(livros.element());
		
		System.out.println("\n=========================\n");
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println("\n=========================\n");
		
		System.out.println("A pilha está vazia? " + livros.isEmpty());
		
		System.out.println("\n=========================\n");

		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.poll());
		//System.out.println(livros.remove());
		
		System.out.println("\n=========================\n");

		System.out.println("A pilha está vazia? " + livros.isEmpty());
		
	
		
		
	}

}
