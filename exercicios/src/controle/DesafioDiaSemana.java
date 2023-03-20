package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Digite o dia da semana:");
			String dia = entrada.next();
			
			if(dia.equalsIgnoreCase("Domingo")) {
				System.out.println("1");				
			}else if(dia.equalsIgnoreCase("Segunda")) {
				System.out.println("2");
			}else if(dia.equalsIgnoreCase("Terça")) {
				System.out.println("3");
			}else if(dia.equalsIgnoreCase("Quarta")) {
				System.out.println("4");
			}else if(dia.equalsIgnoreCase("Quinta")) {
				System.out.println("5");
			}else if(dia.equalsIgnoreCase("Sexta")) {
				System.out.println("6");
			}else if(dia.equalsIgnoreCase("Sabado")) {
				System.out.println("7");
			}else {
				System.out.println("Valor inválido!!!");
			}
						
			entrada.close();
					
		}
}