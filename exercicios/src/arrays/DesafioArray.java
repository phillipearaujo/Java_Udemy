package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe quantas notas serão inseridas: ");
		int quantidade = entrada.nextInt();
		
		double[] notas = new double[quantidade];
		
		for (int i = 0; i < notas.length; i++) {
		System.out.print("Informe a " + (i + 1) + "º nota:");
		notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota : notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.printf("A média é %.2f", media);
		
		entrada.close();
	}

}