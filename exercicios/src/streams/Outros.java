package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10);
		
		List<Aluno> alunos =
				Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("\ndistinct...\n");
		alunos.stream()
			.distinct() // filtra apenas elementos distintos de um conjunto
			.forEach(System.out::println);
		System.out.println("=========================");
		
		System.out.println("\nSkip/Limit...\n");
		alunos.stream()
			.distinct()
			.skip(2) // salta os 2 primeiros da lista
			.limit(3) // define quantos serão retornados
			.forEach(System.out::println);
		System.out.println("=========================");

		System.out.println("\ntakeWhile...\n");
		alunos.stream()
			.distinct()
			//.skip(2) 
			.takeWhile(a -> a.nota > 7) //faça enquanto. Neste caso o segundo elemento da lista não tem nota > 7
			.forEach(System.out::println);
		System.out.println("=========================");
			
		
	}
}
