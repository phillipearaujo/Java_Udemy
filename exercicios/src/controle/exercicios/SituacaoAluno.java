package controle.exercicios;

import java.util.Scanner;

public class SituacaoAluno {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a 1º nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Informe a 2º nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
			if (media >= 7 && media <= 10) {
				System.out.println("Aluno Aprovado com média " + media);
			}else if(media >= 4 && media < 7) {
				System.out.println("Aluno em recuperação com media " + media);
			}else {
				System.out.println("Aluno Reprovado com média " + media);
			}		
		entrada.close();
		
	}

}
