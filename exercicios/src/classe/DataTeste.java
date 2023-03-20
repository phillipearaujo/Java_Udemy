package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		var data1 = new Data();//objeto atrelado ao construtor padrão utilizando valores setados no objeto.
		data1.dia = 17;
		data1.mes = 01;
		data1.ano = 2023;
		
		Data data2 = new Data(); //objeto atrelado ao construtor padrão utilizando valores setados na criação.
		
		Data data3 = new Data(17, 01, 2023);//objeto atrelado ao construtor com parâmetros definidos na criação.
		
		
		System.out.println("Data de codificação: " + data1.obterDataFormatada());
		System.out.println("\nDefalt: " + data2.obterDataFormatada());
		System.out.println("\nData de codificação: " + data3.obterDataFormatada());
	}

}
