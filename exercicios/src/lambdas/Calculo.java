package lambdas;

@FunctionalInterface
public interface Calculo {

	public abstract double executar(double a, double b);
	
	/*
	 * As funções lambdas funcionam apenas quando criamos interfaces funcionais como
	 * pode ser verificado pela expressão @FunctionalInterface no cabeçalho. 
	 * Para utilização da função lambda também é preciso que o método criado seja do tipo
	 * abstrato como deixamos acima de forma explicita e que na interface tenha 
	 * apenas 1 método desse tipo. Podemos ter na mesma interface outros métodos
	 * desde que sejam do explicitos dos tipos 'default' e 'static.
	 * Caso fosse utilizado 'double executar(double a, double b);' também seria
	 * válido pois dessa forma forma está implícito.
	 */
	
	default String legal() {
		return "método 'defalt' é permitido em uma interface funcional!";
	}
	
	static String muitoLegal() {
		return "método 'static' é permitido em uma interface funcional!";
				
	}
	
}
