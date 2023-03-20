package fundamentos;

public class Temperatura_Desafio {
	
	public static void main(String[] args) {
		
		double f = 86;
		double c;
		final int ajuste = 32;
		final double fator = 5/9.0;
		
		c = (f - ajuste)*fator;
		
		System.out.println(c + "°C");
		
	System.out.println("------------------------------");	
		
		f = 0;
		c = (f - ajuste)*fator;
		
		System.out.println(c + "°C");	
		
	}

}
