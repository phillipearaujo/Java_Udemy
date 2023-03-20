package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = 
				p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Notebook", 2987.99, 0.25);
		Produto p3 = new Produto("Caderno", 19.90, 0.03);
		Produto p4 = new Produto("Borracha", 7.80, 0.18);
		Produto p5 = new Produto("Lapis", 4.39, 0.19);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
		/*
		 * Consumer é mais uma das interfaces funcionais disponíveis no java.util.function
		 * Esta recebe apenas 1 único parâmetro e não retorna nada, ou seja, return void. Consumer<T>
		 * Neste exemplo foi passado 'Produto' como parametro na criação do Consumer e o chamamos 
		 * diretamente na linha 15 utilizando o accept passando a ele o produto p1 para imprimir
		 * e depois passamos o consumer para o forEach na linha 24.
		 * Na linha 25 passamos uma função lambda para o forEach e na linha 25 passamos o 
		 * Method Reference que retornou o método toString criado na classe Produto.
		 * 
		 * Utilizando o forEach não temos a necessidade de utilizar o .accept pois ele o 
		 * faz atomáticamente.
		 * 
		 */
	}
}
