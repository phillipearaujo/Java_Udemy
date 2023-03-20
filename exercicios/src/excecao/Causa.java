package excecao;

public class Causa {

	public static void main(String[] args) {
		
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
	}
	
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}
	
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno está NULO...");
	}
		
		System.out.println(aluno.nome);
	}
	
	/*
	 * Nestes exemplos acima conseguimos ver que um erro pode ser causado por outros 
	 * métodos ou classes. Os erros foram tratados de forma individuais. Um exemplo desse 
	 * exemplo na prática, seria você tentar cadastrar um aluno e não conseguir por estar sem
	 * acesso ao banco de dados. Receberia a mensagem 'Aluno está NULO...' mas verificando a 
	 * causa deste erro chegaria ao motivo real podendo tratar pontualmente. 
	 */
}