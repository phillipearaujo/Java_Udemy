package controle.exercicios;

import java.util.Scanner;

public class NumeroPrimo {
	
	public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = entrada.nextInt();
		
		for(int i = 2; i <= numero; i++) {
			if(numero % i == 0);{
				contadorDeDivisores++;
			}
		}
		
		if(contadorDeDivisores == 0 ) {
			System.out.println("O numero " + numero + " é primo." );
		}else {
			System.out.println("O numero " + numero + " não é primo." );			
		}

		entrada.close();
		
	}

}
