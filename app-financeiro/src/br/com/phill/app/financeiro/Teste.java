package br.com.phill.app.financeiro;

import java.util.ServiceLoader;

import br.com.phill.app.Calculadora;

public class Teste {

	public static void main(String[] args) {
		
		Calculadora calc = ServiceLoader
				.load(Calculadora.class)
				.findFirst()
				.get();
		System.out.println(calc.soma(2, 3, 4));
		
//		foi declarado no módulo app calculo o exports to...
//		OperacoesAritmeticas op = new OperacoesAritmeticas();
//		System.out.println(op.soma(4, 5, 6));
		
	}
}
