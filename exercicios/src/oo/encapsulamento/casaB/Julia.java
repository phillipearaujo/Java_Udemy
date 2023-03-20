package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	
	void testeAcessos() {
		Ana sogra = new Ana();
		
		//private segredo
		//default facoDentroDeCasa
		//protected formaDeFalar
		//public todosSabem
		
		//System.out.println(sogra.segredo); // private não é acessivel nem por classe dentro do mesmo pacote
		// System.out.println(sogra.facoDentroDeCasa); // default só é acessivel dentro do mesmo pacote.
		//System.out.println(sogra.formaDeFalar); // protected só é acessivel por outro pacote se recebido por herança
		System.out.println(sogra.todosSabem);
	
	/*
	 * Na classe Júlia só será acessível o atributo public a partir do instanciamento de um novo objeto 
	 * Ana.
	 * 
	 */
	
	}

}
