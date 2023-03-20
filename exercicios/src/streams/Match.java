package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
			//na linha 19 criamos um predicado a partir de outro predicado.
		
		System.out.println(alunos.stream().allMatch(aprovado));
			//usando allMatch() foi perguntado se todos foram aprovados segundo o Predicate<>
		System.out.println(alunos.stream().anyMatch(aprovado));
			//usando anyMatch() foi perguntado se alguém foi aprovado segundo o Predicate<>
		System.out.println(alunos.stream().noneMatch(reprovado));
			//usando noneMatch() foi perguntado se todos foram reprovados segundo o Predicate<>
		
		/*
		 * As funções allMatch(), anyMatch() e noneMatch() também são funções
		 * terminadoras. O que impossibilitam de encadear mais funções após elas.
		 */
	}
}
