package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhora"); //substitui um valor na frase.
		
		s = s.toUpperCase();//define todas letras MAIÚSCULAS
		
		s= s.concat("!!!");//concatena o valor informado a frase.
		
		System.out.println(s);
		
		System.out.println("Phill".toUpperCase());
		
		String X = "Phill".toLowerCase();//define todas letras minúsculas
		System.out.println(X);

		String y = "Bom dia X"
					.replace("X", "Phill")
					.toUpperCase()
					.concat("!!!");
		System.out.println(y);
		
	}
}
