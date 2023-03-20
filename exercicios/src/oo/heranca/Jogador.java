package oo.heranca;

public class Jogador {
	
	public int live = 100;
	public int x;
	public int y;
	
	public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.live -= 10;
			return true;
		}else if(deltaX == 0 && deltaY == 0) {
			oponente.live -= 10;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean andar(Direcao_Enum direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		return true;
	}

}
