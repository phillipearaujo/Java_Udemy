package fundamentos.exercicios;

import java.util.Scanner;

public class ExercicioTemperatura {
	
	public static void main(String[] args) {
		
		//°F = °C x 9 ÷ 5 + 32
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a temperatura em Celsius: ");
		
		double c = entrada.nextDouble(); 
		double f;
		final int ajuste = 32;
		final double fator = 9 / 5.0;
		
		f = c * fator + ajuste;
		
		System.out.println("A temperatura em Fahrenheit é " +
							f + "°F");
		
		entrada.close();
	}
}
