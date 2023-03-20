package controle;

public class Continue {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
/*
 * continue interrompe apenas a repetição e vai para a proxima.
 * No exemplo acima quando o valor do if é verdadeiro, entra no 
 * continue e faz a próxima interação antes que o programa imprima
 * o resultado na tela.
*/
			}
			System.out.println(i);

		}
	}

}
