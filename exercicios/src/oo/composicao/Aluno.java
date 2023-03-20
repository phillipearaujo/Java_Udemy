package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}	
	
	public String toString() { //metodo criado para converter um objeto para um formato String.
		return nome;		   // para testar comente todo o método e rode o programa
	}

}