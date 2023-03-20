package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	
			System.out.print("Digite o 1º salário: R$");
			String salario1 = entrada.nextLine().replace(",", ".");
	
			System.out.print("Digite o 2º salário: R$");
			String salario2 = entrada.nextLine().replace(",", ".");
	
			System.out.print("Digite o 3º salário: R$");
			String salario3 = entrada.nextLine().replace(",", ".");
	
				double prim = Double.parseDouble(salario1);
				double sec = Double.parseDouble(salario2);
				double ter = Double.parseDouble(salario3);
		
				double soma = prim + sec + ter;
	
			System.out.println("\nA média salarial é: " + soma / 3);

		entrada.close();
	}
}
