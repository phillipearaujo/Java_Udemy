package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	/*
	 * Objeto Ferrari instanciado de maneira explicita pois não temos mais o 
	 * construtor padrão na classe genérica Carro. Utilizando o super para chamar o 
	 * contrutor e atribuir a ele o atributo esperado. Nesse caso o valor
	 * int velocidadeMaxima.
	 */
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari(){
		this(250);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	
	/*
	 * Vamos sobre escrever o método acelerar e frear alterando o valor 
	 * apenas para a classe Ferrari. Digitando o nome do método + CTRL + espaço
	 * o eclipse ja preenche com a marcação @Override para validar a sobrescrição.
	 * a cada chamada super. ele adiciona o valor definido no método original. 
	 * Valor para 1 acelerar foi definido como 50 chamando 2x soma-se 100 a cada 
	 * chamada na classe velocimetro.
	 */
	
//	@Override
//	public void acelerar() {
//		super.acelerar();
//		super.acelerar();
//	}
	
	/*
	 * No método frear o valor definido foi 5. Ao sobre escrever o método foi chamado
	 * o .super por 4x diminuindo a velocidade de 20 em 20 a cada chamada na classe 
	 * Velocímetro.
	 */
	
//	@Override
//	public void frear() {
//		super.frear();
//		super.frear();
//		super.frear();
//		super.frear();
//	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		}else if(ligarTurbo && ligarAr) {
			return 30;
		}else if(!ligarTurbo && !ligarAr) {
			return 20;
		}else {
		return 15;
		}
	}
	
}
