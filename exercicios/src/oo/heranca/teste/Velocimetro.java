package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Velocimetro {
	
	public static void main(String[] args) {
		
		Carro civic = new Civic();
		
		civic.acelerar();
		System.out.println("Civic: " + civic.velAtual);
		civic.acelerar();
		System.out.println("Civic: " + civic.velAtual);
		civic.acelerar();
		System.out.println("Civic: " + civic.velAtual);
		civic.acelerar();
		System.out.println("Civic: " + civic.velAtual);
		civic.acelerar();
		System.out.println("Civic: " + civic.velAtual);
		
		civic.frear();
		System.out.println("Civic: " + civic.velAtual);
		civic.frear();
		System.out.println("Civic: " + civic.velAtual);
		civic.frear();
		System.out.println("Civic: " + civic.velAtual);
		civic.frear();
		System.out.println("Civic: " + civic.velAtual);
		civic.frear();
		System.out.println("Civic: " + civic.velAtual);
		civic.frear();
		System.out.println("Civic: " + civic.velAtual);
		System.out.println();

		
		Ferrari ferrari = new Ferrari();
		
		ferrari.ligarTurbo();
		
		//ferrari.ligarAr();
		
		ferrari.acelerar();
		System.out.println("Ferrari: " + ferrari.velAtual);
		ferrari.acelerar();
		System.out.println("Ferrari: " + ferrari.velAtual);
		ferrari.acelerar();
		System.out.println("Ferrari: " + ferrari.velAtual);
		ferrari.acelerar();
		System.out.println("Ferrari: " + ferrari.velAtual);
		ferrari.acelerar();
		System.out.println("Ferrari: " + ferrari.velAtual);
		
		ferrari.frear();
		System.out.println("Ferrari: " + ferrari.velAtual);
		ferrari.frear();
		System.out.println("Ferrari: " + ferrari.velAtual);
		ferrari.frear();
		System.out.println("Ferrari: " + ferrari.velAtual);
		
	}

}
