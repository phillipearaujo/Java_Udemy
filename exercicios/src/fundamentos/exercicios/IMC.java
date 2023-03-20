package fundamentos.exercicios;

import java.util.Scanner;

public class IMC {
	
	public static void main(String[] args) {
		
		//IMC = peso / (altura x altura)
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu peso: ");
		double peso = entrada.nextDouble();

		System.out.print("Informe sua altura em cm: ");
		double altura = entrada.nextDouble();

		entrada.close();
		
		double resultado = peso / Math.pow(altura, 2);

		System.out.printf("Seu IMC é : %f", resultado);
		
	}

}
