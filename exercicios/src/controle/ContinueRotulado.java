package controle;

public class ContinueRotulado {
	
public static void main(String[] args) {
		
		externo:
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == 1) {
					continue externo;
				}
/*
 * No exemplo acima vimos que também é possível rotular o continue. Para visualisar o 
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
