package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		//Tipos numéricos inteiros
		
		byte anosDeEmpresa = 23;
		short numerosDeVoo = 524;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos numéricos reais
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		
		boolean estaDeFerias = false;
		
		//Tipo caracter
		
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numeros de voos
		System.out.println(numerosDeVoo / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha R$" + salario);
		System.out.println("Está de ferias? " + estaDeFerias);
		System.out.println("Status funcionário: " + status);
		
		
		
	}

}
