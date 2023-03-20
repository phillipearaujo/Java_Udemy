package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {
	
	//private segredo
	//default facoDentroDeCasa
	//protected formaDeFalar
	//public todosSabem
		
		/*
		 * Ana mae = new Ana();
		 * 
		 * Como Pedro extends Ana, ou seja, Pedro recebe atributos e comportamentos de Ana por herança, 
		 * não há necessidade de instanciar Ana como feito logo acima. Os atributos protected e public 
		 * serão acessados diretamente via herança.
		 */

		//System.out.println(esposa.segredo); // private não é acessivel nem por classe dentro do mesmo pacote
		//System.out.println(mae.facoDentroDeCasa); // default só é acessivel dentro do mesmo pacote.
		//System.out.println(mae.formaDeFalar); // acessivel apenas por herança, dispensa o instanciamento.
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	
	}

}
