package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {

		Calculo calculo = (x,y) -> {return x + y;}; // expressão lambda
		System.out.println(calculo.executar(2,3));

		calculo = (x,y) -> x * y; // expressão lambda
		System.out.println(calculo.executar(2,3));

		/*
		 * Utilizamos a função lambda para repetir o comportamento da classe
		 * CalculoTeste1. 
		 * A vantagem de se usar a função lambda é que conseguimos sintetizar o
		 * nosso código. Neste simples exemplo a partir da interface Calculo a 
		 * expressão lambda elimina as classes Somar e Multiplicar pois não 
		 * necessita dos métodos criados em cada uma delas.
		 * 
		 */
		
		System.out.println(calculo.legal()); // método defalt é acessado atravéz da variável
		System.out.println(Calculo.muitoLegal()); // método static é acessado atravéz da interface
	
	
	}
	
	
	
	
}
