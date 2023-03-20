package oo.composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro(); // criado o objeto Carro
		System.out.println(c1.estaLigado());
		
		c1.ligar(); // chamado o método ligar
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros()); // acesso ao objeto motor para chegar ao metodo giros
		
		c1.acelerar(); // chamado o método acelerar, aumentando o fatorInjeção em 0.4*3000 a cada chamada
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.motor.giros());
		
		c1.frear(); // chamado o método frear, reduzindo o fatorInjeção em 0.4*3000 a cada chamada
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println(c1.motor.giros());
		
	}

}
