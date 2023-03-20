package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.6);
		
		System.out.println(convidado.getPeso());
		
		//Arroz ingrediente1 = new Arroz(0.2); // utlizado para polimorfismo estático
		Comida arroz = new Arroz(0.2);
		//Feijao ingrediente2 = new Feijao(0.19); // utlizado para polimorfismo estático
		Comida feijao = new Feijao(0.19);
		
		convidado.comer(arroz);
		convidado.comer(feijao);
		
		System.out.println(convidado.getPeso());
		
		//Sorvete sobremesa = new Sorvete(0.25); // utlizado para polimorfismo estático
		Comida sobremesa = new Sorvete(0.25);
		
		
		convidado.comer(sobremesa);
		

		System.out.println("Após a sobremesa você está pesando " 
				+ convidado.getPeso());
		
	}

}
