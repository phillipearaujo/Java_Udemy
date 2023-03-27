package br.com.phill.app.calculo.interno;

import java.util.Arrays;

public class OperacoesAritmeticas {

	public Double soma (double... nums) {
		return Arrays.stream(nums).reduce(0.0, (t, a) -> t + a);
	}
}
