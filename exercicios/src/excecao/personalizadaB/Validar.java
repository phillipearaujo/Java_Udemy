package excecao.personalizadaB;

import excecao.Aluno;

public class Validar {
	
	private Validar() {
		
	}
	
	
	public static void aluno(Aluno aluno) 
			throws StringVaziaException, NumeroForaIntervaloException {
		
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		} // excecao do Java - IllegalArgumentException
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		} // excecao personalizada - StringVaziaException 
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		} // excecao personalizada - NumeroForaIntervaloException
	}
}
