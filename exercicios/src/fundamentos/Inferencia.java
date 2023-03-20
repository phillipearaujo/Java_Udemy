package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		//a = "Texto;" Neste caso a variável a ja havia sido definida como double.
		
		System.out.println("--------------------");
		
		double b = 4.5;
		System.out.println(b);
		
		System.out.println("--------------------");

		String c = "Texto";
		System.out.println(c);
		
		c = "outro texto";
		System.out.println(c);
		
		//c = 45; Neste caso a variável c ja havia sido definida como String. 
		
		System.out.println("--------------------");
		
		/*
		 * INFERENCIA é o recurso utilizado em que o próprio JAVA define o tipo da
		 * variável através do valor atribuído. Uma vez esse tipo atribuido, seja ele
		 * de forma manual como na variável 'a' ou por inferencia como na variável 'c'
		 * não pode mais ser alterado.
		 */
		
	}
}
