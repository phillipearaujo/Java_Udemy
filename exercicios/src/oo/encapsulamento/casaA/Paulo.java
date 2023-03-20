package oo.encapsulamento.casaA;

public class Paulo {
	
	Ana esposa = new Ana();
	
	void testeAcessos() {
		//private segredo
		//default facoDentroDeCasa
		//protected formaDeFalar
		//public todosSabem
		
//	System.out.println(esposa.segredo); // private não é acessivel nem por classe dentro do mesmo pacote
	System.out.println(esposa.facoDentroDeCasa);
	System.out.println(esposa.formaDeFalar);
	System.out.println(esposa.todosSabem);
	
	}

}
