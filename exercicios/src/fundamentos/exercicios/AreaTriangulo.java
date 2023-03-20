package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informa a base do triângulo: ");
		float b = entrada.nextFloat();
		System.out.print("Informa a altura do triângulo: ");
		float h = entrada.nextFloat();
		
		entrada.close();
		
		float calculo = (b*h) / 2;
		
		System.out.println("A área é: " + calculo);
				
	}
	
}