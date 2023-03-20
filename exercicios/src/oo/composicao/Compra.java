package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	double obterValorTotal() { // método para calcular valor total da compra
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
	
	

}
