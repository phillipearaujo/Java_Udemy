package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) ->{
			if(aluno1.nota > aluno2.nota)return 1;
			if(aluno2.nota > aluno1.nota)return -1;
			return 0;
		};
		
		/*
		 * Comparator<> tbm é uma interface funcional que tem como objetivo comparar 2 objetos.
		 * quando retorna 1 significa que o primeiro objeto passado como parâmetro é maior
		 *  que o segundo e retornando -1 significa que o segundo objeto é maior que o primeiro.
		 *  Retornando 0 os objetos comparados são iguais.
		 */
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
	}

}
