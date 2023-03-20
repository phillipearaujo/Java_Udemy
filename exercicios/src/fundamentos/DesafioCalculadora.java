package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1º numero: ");
		float primeiro = entrada.nextInt();
				
		System.out.print("informe o operador: ");
		String operador = entrada.next();

		System.out.print("Digite o 2º numero: ");
		float segundo = entrada.nextInt();
				
		float resultado = "+".equals(operador)? primeiro + segundo: 0;
			  resultado = "-".equals(operador)? primeiro - segundo: resultado;
		  	  resultado = "*".equals(operador)? primeiro * segundo: resultado;
			  resultado = "/".equals(operador)? primeiro / segundo: resultado;
			  resultado = "%".equals(operador)? primeiro % segundo: resultado;
				
		System.out.printf("\n%.2f %s %.2f = %.2f", primeiro, operador, segundo, resultado);
		
		entrada.close();
	}
}
