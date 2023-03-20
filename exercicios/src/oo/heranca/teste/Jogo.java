package oo.heranca.teste;

import oo.heranca.Direcao_Enum;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Heroi heroi = new Heroi();// com a herança criada pode substituir utilizando a classe herdada.
		//Jogador j1 = new Jogador();
		heroi.x = 10;
		heroi.y = 10;
		
		heroi.andar(Direcao_Enum.SUL);
		heroi.andar(Direcao_Enum.SUL);
		heroi.andar(Direcao_Enum.SUL);
		heroi.andar(Direcao_Enum.SUL);
		heroi.andar(Direcao_Enum.SUL);
		heroi.andar(Direcao_Enum.SUL);
		
		heroi.andar(Direcao_Enum.LESTE);
		heroi.andar(Direcao_Enum.LESTE);
		heroi.andar(Direcao_Enum.LESTE);
		heroi.andar(Direcao_Enum.LESTE);
		heroi.andar(Direcao_Enum.LESTE);
		
		System.out.println(heroi.y);
		System.out.println(heroi.x);
		System.out.println("========");
		
		Monstro monstro = new Monstro();// com a herança criada pode substituir utilizando a classe herdada.
		//Jogador monstro = new Jogador();
		monstro.x = 10;
		monstro.y = 11;

		monstro.andar(Direcao_Enum.LESTE);
		monstro.andar(Direcao_Enum.LESTE);
		monstro.andar(Direcao_Enum.LESTE);
		monstro.andar(Direcao_Enum.LESTE);
		monstro.andar(Direcao_Enum.LESTE);
		monstro.andar(Direcao_Enum.LESTE);
		
		System.out.println(monstro.y);
		System.out.println(monstro.x);
		System.out.println("========");
		
		System.out.println("Heroi tem " + heroi.live);
		System.out.println("Monstro tem " + monstro.live);
		System.out.println("========");
		
		heroi.atacar(monstro);
		heroi.atacar(monstro);

		heroi.atacar(monstro);
		monstro.atacar(monstro);
		
		System.out.println("Heroi tem " + heroi.live);
		System.out.println("Monstro tem " + monstro.live);
		System.out.println("========");
		
		monstro.atacar(heroi);
		System.out.println("Heroi tem " + heroi.live);
		System.out.println("Monstro tem " + monstro.live);

	}

}
