package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		BinaryOperator<Double> somatorio = (a, b) -> a + b;
		
		alunos.stream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(somatorio)
			.ifPresent(System.out::println);
		/*
		 * Neste exemplo usamos o filter() para filtrar apenas notas >= a 7,
		 * o map() para mapear essas notas e armazenalas em 'a', e por último o 
		 * reduce() para fazer a soma. Com o filtro foi excluido apenas a 
		 * nota 6.1
		 */
	}
}
