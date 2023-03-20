package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		
		/*Wrappers são a versão objeto dos tipos primitivos.
		  Estes dão a possibilidade de usarmos a notação ponto(.)
		  da mesma forma que é possível usar num tipo String. 
		*/
	
	/* Primitivo / Wrapper(objeto)
	 * byte          Byte 
	 * short         Short
	 * int           Integer
	 * long          Long
	 * float         Float
	 * double        Double
	  
	 * boolean       Boolean
	 * char          Character
	*/
		
		Byte b = 100;
		System.out.println(b.byteValue()); //imprime o valor atribuído
		
		Short s = 1000;
		System.out.println(s.toString()); //transforma numérico em String
		
		Integer i = 10000;
		System.out.println(i.intValue() * 2);
		
		Long l = 100000L; //obrigatório usar L no final da atribuição.
		System.out.println(l / 2);
		
		Float f = 123.1F;
		System.out.println(f.floatValue());
		
		Double d = 123.456;
		System.out.println(d.toString()); //converte o valor numérico em tipo String
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = 'S';
		System.out.println(c.toString().toLowerCase().concat("..."));
				
	}
}
