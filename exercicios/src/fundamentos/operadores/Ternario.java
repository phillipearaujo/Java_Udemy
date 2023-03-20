package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 5.1;
		
		String resParcial = media >= 4 ? "em recuperação." : "reprovado.";
		String resFinal = media >= 7 ? "aprovado." : resParcial;
		
		System.out.println("O aluno está " + resFinal);
		
	}
}