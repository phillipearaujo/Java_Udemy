package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
	
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n",//printf para formatado
				1,2,3,4,5,6); //%d para números inteiros 
		
		System.out.printf("Salário: %.1f\n",1235.879); //%f para número com decimais
												//%.1f mostra apenas uma casa decimal
		
		System.out.printf("Nome: %s", "João\n\n"); //%s para String
		
		System.out.println("-----------------------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.print("Disgite seu nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Disgite seu sobrenome: ");
			String sobrenome = entrada.nextLine();
			
			System.out.print("Disgite sua idade: ");
			int idade = entrada.nextInt();
			
			System.out.printf("\nNome: %s %s", nome, sobrenome);

			System.out.printf("\n\n%s %s tem %d anos.", // %d números inteiros
							  nome, sobrenome, idade);
		
		entrada.close();		
	}
}
