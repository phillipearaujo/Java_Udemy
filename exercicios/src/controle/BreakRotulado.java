package controle;

public class BreakRotulado {
	
	public static void main(String[] args) {
		
		externo:
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == 1) {
					break externo;
				}
/*
 * Neste caso temos 2 laços de repetição 'for' e queremos interromper o laço externo
 * utilizando o break. Foi atribuído o rótulo 'externo' para identificar ao 'break' qual
 * laço interromper. Por regra o break interrompe o laçõ em que ele está associado e no 
 * exemplo é possivel alterar essa regra. Para visualisar o 
 * teste e analisar o resultado, exclua o rótulo e execute o programa. 
 * Evitar utlizar a prática 'BreakRotulado'.
 */
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim");
	}

}