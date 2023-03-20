package oo.heranca.desafio;

public class Civic extends Carro {
	
	/*
	 * Objeto Civic instanciado de maneira explicita pois não temos mais o 
	 * construtor padrão na classe genérica Carro. Utilizando o super para chamar o 
	 * contrutor e atribuir a ele o atributo esperado. Nesse caso o valor
	 * int velocidadeMaxima.
	 */
	
	public Civic(){
		super(200);
	}
	
	public Civic(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}
	
	/*
	 * A classe Civic tem os atributos e métodos da classe Carro recebidos
	 * por herança. Utiliza os valores atribuidos para os métodos acelerar() 
	 * e frear().
	 */
	
}
