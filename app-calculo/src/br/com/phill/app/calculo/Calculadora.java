package br.com.phill.app.calculo;

import br.com.phill.app.calculo.interno.OperacoesAritmeticas;
import br.com.phill.app.logging.Logger;

public class Calculadora {

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public Double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}
}
