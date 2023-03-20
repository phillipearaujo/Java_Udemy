package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String ("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));//.equals verifica o conteúdo da variável String.
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine();
		System.out.println(s2);
		System.out.println("2" == s2);
		System.out.println(s2.trim());//.trim elimina espaços em branco antes e depois
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
				
		entrada.close();
			
	}

}