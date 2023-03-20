package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
			System.out.print("Quantos alunos? ");
			int qtdeAlunos = entrada.nextInt();
			
			System.out.print("Quantas notas por aluno? ");
			int qtdeNotas = entrada.nextInt();
			
			double [][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
			
			double total = 0;
			for (int a = 0; a < notasDaTurma.length; a++) {
				for (int n = 0; n < notasDaTurma[a].length; n++) {
					System.out.printf("Informe a %dº nota do %dº aluno: ", n+1, a+1);
					notasDaTurma[a][n] = entrada.nextDouble();
					total += notasDaTurma[a][n];
				}
			}
			System.out.println();
			
			for (double[] notasDoAluno : notasDaTurma) {
				System.out.println(Arrays.toString(notasDoAluno));
			}
			
			double media = total / (qtdeAlunos * qtdeNotas);
			System.out.printf("\nA média da turma é %.2f", media);
		
				
		entrada.close();
	}

}
