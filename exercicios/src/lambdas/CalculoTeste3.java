package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {

		BinaryOperator<Double> calculo = (x,y) -> {return x + y;}; 
		System.out.println(calculo.apply(2.0,3.0));
		
		calculo = (x,y) -> x * y; 
		System.out.println(calculo.apply(2.0,3.0));
		
		
		BinaryOperator<Integer> calculo2 = (x,y) -> {return x + y;}; 
		System.out.println(calculo2.apply(2,3));
		
		calculo2 = (x,y) -> x * y; 
		System.out.println(calculo2.apply(2,3));
		
		/*
		 * Neste exemplo utilizamos uma interface funcional do próprio java.util eliminando de 
		 * vez a criação de uma interface pelo programador e altamente funcional com expressões 
		 * lambdas. Note que ao executar o código o comportamento apresentado é o mesmo sem 
		 * nehuma ligação com a interface ou os métodos utilizados em CalculoTeste1 e CalculoTeste2.
		 * Para consulta de todas inrfaces funcionais do java consulte em 
		 * https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html 
		 * 
		 * A interface utilizada no exemplo é a BinaryOperator que Representa uma operação sobre 
		 * dois operandos do mesmo tipo, produzindo um resultado do mesmo tipo dos operandos. 
		 * 
		 */
		

	}
	
}