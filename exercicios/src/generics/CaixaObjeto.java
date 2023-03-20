package generics;

public class CaixaObjeto {
	
	private Object coisa;
	
	public Object abrir() { // método get
		return coisa;
	}

	public void guardar(Object coisa) { // método set
		this.coisa = coisa;
	}
	
}
