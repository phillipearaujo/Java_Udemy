package controle.exercicios;

import java.util.Scanner;

public class Verificar0a10 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um número: ");
			int n = entrada.nextInt();
		
		if(n >= 0 && n <= 10) {
			if(n % 2 == 0) {
				System.out.println("Número par");
			}else {
				System.out.println("Número impar");
			}
		}else {
			System.out.println("Número fora do range 0 a 10!");
		}	

		entrada.close();
		
	}

}
