package classe;

public class ValorNull {
	
	public static void main(String[] args) {
		
		String s1 = ""; //neste caso a variável foi inicializada com valor vazio.
		System.out.println(s1.concat("!!!"));
		
//		String s2; // neste a variável recebeu o valor null automático tornando a inválida para acesso gerando um erro de compilação.
//		System.out.println(s2.concat("???"));
		
//		String s2 = null; // neste o erro é de tempo de execução porque está tentando acessar variável com valor nulo.
//		System.out.println(s2.concat("???"));
		
		Data dia1 = Math.random()>0.5 ? new Data() : null;
		if(dia1 != null) {
			dia1.mes = 3;
			System.out.println(dia1.obterDataFormatada());
		}
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		if(s2 != null) {
			System.out.println(s2.concat("????"));
		}

	}

}
