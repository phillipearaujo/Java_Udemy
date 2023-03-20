package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num2).length());
		
		/*
		 * Os 3 exemplos acima nos mostram como converter um tipo 
		 * numérico para String possibilitando o uso da notação ponto.
		 * Os 2 primeiros utilizando o Wrapper e 
		 * no último e menos usual concatenando a variável com uma 
		 * String vazia.
		*/		
	}
}
