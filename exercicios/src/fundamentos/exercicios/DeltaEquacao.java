package fundamentos.exercicios;

public class DeltaEquacao {
	
	public static void main(String[] args) {
		
		Integer a = 1;
		Integer b = 12;
		Integer c = -13;
		
		Float delta = (float)Math.pow(b, 2)-(4*a*c);
		
		System.out.println("O valor de Delta é: " + delta);
		
		double x1 = (-b + Math.sqrt(delta))/(2*a);
		System.out.println("X¹ é igual: " + x1);

		double x2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.println("X² é igual: " + x2);
		
		System.out.printf("\nA equação é: %dx² + %dx + %d = 0", a,b,c);
		
	}

}
