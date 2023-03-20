package oo.composicao;

public class Carro {
	
	Motor motor = new Motor(); // instanciado motor para fazer a relação Carro com Motor
	
	void acelerar() { // método acelerar adiciona 0.4 ao fatorInjecao
		if(motor.fatorInjecao < 2.6) { // if de proteção para que o giro não ultrapase (2.6+0.4)*3000rpm
		motor.fatorInjecao += 0.4;
		}
	}
	
	void frear() { // método frear diminui 0.4 ao fatorInjecao
		if(motor.fatorInjecao > 0.5) { // if de proteção para que o giro do motor não chegue a um valor negativo
		motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}

}
