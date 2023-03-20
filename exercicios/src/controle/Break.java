package controle;

public class Break {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			if(i == 5) {
				break;
/*
 *break interrompe abruptamente o enlace for quando é chamado pelo 'if'.
 *No exemplo acima, quando a expressão do 'if' é verdadeira o break
 *interrompe por completo a repetição do 'for'. Não permite nem a 
 *impressão do último valor na tela.
*/
			}
			System.out.println(i);
		}
		System.out.println("Fim!");

	}

}