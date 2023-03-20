package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String word = "";
		
		while(!word.equalsIgnoreCase("sair")) {
			System.out.print("Você disse: ");
			word = entrada.nextLine();
		}
		
		entrada.close();
		
	}
}