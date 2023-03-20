package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
	boolean condicao1 = true;	
	boolean condicao2 = 3 > 7;	
	
	System.out.println(condicao1 && !condicao2);
	System.out.println(condicao1 || condicao2);
	System.out.println(condicao1 ^ condicao2);
	System.out.println(!!condicao1);
	System.out.println(!condicao2);
	
	System.out.println("\nTabela verdade E ( and - && )");
	System.out.println(true && true);
	System.out.println(true && false);
//	System.out.println(false && true);
//	System.out.println(false && false);
		
	System.out.println("\nTabela verdade OU ( or - || )");
//	System.out.println(true || true);
//	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	
	System.out.println("\nTabela verdade OU Exclusivo ( xor - ^ )");
	System.out.println(true ^ true);
	System.out.println(true ^ false);
	System.out.println(false ^ true);
	System.out.println(false ^ false);
	
	System.out.println("\nTabela verdade Negação ( not - ! )");
	System.out.println(!true);
	System.out.println(!false);
	
	
	}
}
