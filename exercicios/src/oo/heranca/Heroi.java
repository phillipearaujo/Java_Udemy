package oo.heranca;

public class Heroi extends Jogador {
	
	/*
	 * Classe Heroi herda os atributos e comportamento da classe Jogador
	 * com a utilização da palavra chave extends. Lê-se "Heroi extende Jogador."
	 * As Classes Heroi e Monstro herdam os mesmos comportamentos da classe Jogador.
	 * 
	 */
	public boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.live -= 20;
			return true;
		}else if(deltaX == 0 && deltaY == 0) {
			oponente.live -= 20;
			return true;
		}else {
			return false;
		}
		/*
		 * Dentro da classe Monstro é possível alterar o parametro como visto acima, o código foi 
		 * sobre-escrevendo o metodo aumentando para 20 o decréscimo de live apenas para o jogador Heroi
		 * deixando o jogador Monstro com o valor herdado originalmente da classe Jogador.
		 * 
		 */
	}
}
