package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	// o principal conceito da fila é: O PRMIMEIRO A ENTRAR É O PRIMEIRO A SAIR
	//First in, first out. (FIFO)
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		/* Para adicionar valores em uma fila podemos utilizar .add() e/ou .offer().
		 * a diferença entre eles é vista em caso de filas que possuam restrição de tamanho.
		 * .add() -> lancará uma excessão caso a fila esteja cheia
		 * .offer() -> retorna falso caso a fila esteja cheia
		 */
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.add("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		/*
		 * A diferença de comportamento entre .peek() e .element() ocorre quando a fila está vazia.
		 * No caso do .peek() retorna no console um valor null(false) e o .element() retorna uma exception.
		 * 
		 * Ambos obteem o próximo elemento da fila sem remover. Então se apenas duplicarmos as linhas 
		 * 27 ou 28 sempre será impresso o primeiro nome da lista.
		 */
		
		/*Outros métodos importantes 
		
		fila.size(); -> verificar o tamanho da fila
		fila.clear(); -> limpar a fila
		fila.isEmpty(); -> verificar se a fila está vazia
		fila.contains(); -> para verificar se um valor está na fila
		
		*/
		
		
		//O método .poll() e o .remove() tem a mesma função de remover itens da fila.
		
		System.out.println(fila.poll()); // retorna no console o primeiro elemento da fila e já o remove
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // quando finaliza a limpeza da  lista retorna um valor null
		System.out.println(fila.remove());// quando finaliza a limpeza lista retorna uma exception
		
	}

}
