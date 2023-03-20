package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 9.8);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Rebeca", 7.1);
		Aluno a6 = new Aluno("Pedro", 8.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		alunos.stream()
			.filter(a -> a.nota >= 7)
			.map(a -> "Parabéns " + a.nome + "!. Você foi aprovado(a)!!!")
			.forEach(System.out::println);
		
		/*
		 * as funções lambdas entre parentese podem ser substituidos por métodos utilitários
		 * como Predicate e Function. Essas funções criadas dessa forma nos permite reutiliza-las
		 * em outras classes do código.
		 * 
		 * Predicate<Aluno> aprovado = a -> a.nota >= 7;
		 * 
		 * Function<Aluno, String> saudaçãoAprovado = 
		 * 			a -> "Parabéns " + a.nome + "!. Você foi aprovado(a)!!!";
		 * 
		 * ficando ao criar o stream:
		 * 
		 * alunos.stream()
		 * 		.filter(aprovados)
		 * 		.map(saudacaoAprovados)
		 * 		.forEach(System.out::println);
		 * 
		 */
	}
}
