package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(4));//mostra a letra no campo 4
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa")); //começa com. Case sensitive
		System.out.println(s.startsWith("boa"));
		System.out.println(s.endsWith("boa")); //termina com. Case sensitive
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		System.out.println("-------------------------------");
		
		var nome = "Pedro";
		var sobrenome = "Sampaio";
		var idade = 33;
		var salario = 12547.33;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " 
							+ sobrenome + "\nIdade: " + idade 
							+ "\nSalário: " + salario);
		
		System.out.println("-------------------------------");

		System.out.printf("\nNome: %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade,salario);
		

		String frase = String.format("\n\nNome: %s %s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade,salario);
		System.out.println(frase);
		
		System.out.println("-------------------------------");
		
		System.out.println(frase.contains("Sampaio")); // verifica se contem a String
		System.out.println(frase.indexOf("Sampaio")); //indica o inicio da String
		System.out.println(frase.substring(13)); // a partir da posição 13
		System.out.println(frase.substring(13, 21));// entre a posição 13 e 21
		
	}
}
