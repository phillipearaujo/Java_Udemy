import br.com.phill.app.calculo.CalculadoraImpl;

module app.calculo {

	requires transitive app.logging;
	exports br.com.phill.app.calculo;
	
	exports br.com.phill.app.calculo.interno
		to app.financeiro;
	
	requires app.api;
	provides br.com.phill.app.Calculadora
		with CalculadoraImpl;
}