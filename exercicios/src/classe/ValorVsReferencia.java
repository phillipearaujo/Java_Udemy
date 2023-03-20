package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {

		double a = 2;

		double b = 0;
		b--;
		System.out.println(a + " " + b);
		System.out.println("---------------");
		double b1 = a; // atribuição por valor (Tipos Primitivos)
		System.out.println(a + " " + b1);

		a++;
		Data d1 = new Data(1, 6, 2023);
		Data d2 = d1; // atribuição por referência (Objeto)

		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		System.out.println("---------------");

		voltarDataValorPadrao(d1);

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println("---------------");

		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}

	static void voltarDataValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

	static void alterarPrimitivo(int a) {
		a++;
	}

}
