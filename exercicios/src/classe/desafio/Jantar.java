package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
			
		Comida prato1 = new Comida("Feijão", 0.140);
		Comida prato2 = new Comida("Arroz", 0.120);
		Comida prato3 = new Comida("Carne", 0.150);
				
		Pessoa p1 = new Pessoa("José", 99.6);
		
		System.out.printf(p1.apresentar());
		
		p1.comer(prato1);
		System.out.printf(p1.apresentar());
		
		p1.comer(prato2);
		p1.comer(prato3);
		System.out.printf(p1.apresentar());
	
	}
}