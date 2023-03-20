package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));//inicializado com valor padrão 0.0

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		System.out.println(Arrays.toString(notasAlunoA));//valores atribuidos. acessa todas as posições no Array
		System.out.println(notasAlunoA[1]);//acessa a nota na posição 1 do Array
		//System.out.println(notasAlunoA[4]); //ERRO! posição não existe no Array
		
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println("Média aluno A: " + totalAlunoA / notasAlunoA.length);
		
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println("Média aluno B: " + totalAlunoB / notasAlunoB.length);
	}

}
