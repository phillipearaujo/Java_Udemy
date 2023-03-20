package excecao;

public class Basico {

	public static void main(String[] args) {

		Aluno a1 = null;

		try {
			imprimirNomeDoAluno(a1);
		} catch (Exception excecao) {
			System.out.println("Ocorreu um erro no momento de" 
							   + "imprimir o nome do usuário");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu erro: " + e.getMessage());
			;
		}

		System.out.println("Fim ..|.,");
		
	/*
	 * Acima temos dois exemplos de erros que conseguimos tratar utilizando try/catch. O eclipse
	 * nos dá opção de gerar esse bloco automaticamente selecionando toda a linha com o código + 
	 * Alt+shift+z e selecionando a opção try/catch block. 
	 * Dentro do bloco try é inserido o trecho de código que tem a 'possibiliddade' de gerar 
	 * um erro e dentro de catch fazemos o tratamento que pode ser: imprimir uma mensagem para o 
	 * usuário como fizemos ou ocultar esse erro deixando o bloco catch vazio(ou com a informação
	 * comentada) mas gerando um arquivo de log para salvar as mensagens de erro e tratamento posterior. 
	 * Ao tratar um erro básico o ideal é que sejamos expecíficos como no segundo exemplo.
	 * 
	 */
	}
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}