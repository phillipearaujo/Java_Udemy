package generics;

public class Caixa<t> {

	private t coisa;

	public t abrir() { // método get
		return coisa;
	}

	public void guardar(t coisa) { // método set
		this.coisa = coisa;
	}
}
