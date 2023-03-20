package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Function<Produto, Double> precoReal = 
				produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = 
				valor -> valor >= 2500 ? valor * 1.085 : valor;
		UnaryOperator<Double> frete = 
				valor -> valor >= 3000 ? valor + 100 : valor + 50;
		UnaryOperator<Double> arrendodamento = 
				valor -> Double.parseDouble(String.format("%.2f", valor));
		Function<Double, String> formatacao = 
				valor -> ("RS" + valor).replace(".", ",");

		Produto p = new Produto("iPad", 3235.89, 0.13);
		String valor = precoReal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arrendodamento)
				.andThen(formatacao)
				.apply(p);
		System.out.println("O preço final é " + valor);
		
		}
	
}