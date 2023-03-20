package fundamentos.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		int num1 = 6 *(3 + 2);
		int numerador1 = (int)Math.pow(num1, 2);
		int deno1 = 3 * 2;
		
		int num2 = (1 - 5)* (2 - 7);
		int numerador2 = (int)Math.pow(num2, 2);
		int deno2 = (int)Math.pow(2, 2);
				
		int numTotal = numerador1 / deno1 - numerador2 / deno2;
		
		int numerador = (int)Math.pow(numTotal, 3);
				
		int divisor = (int)Math.pow(10, 3);
				
		System.out.println(numerador / divisor);
		
	}
}
