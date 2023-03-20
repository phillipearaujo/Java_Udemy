package cursoJV.udemy.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	public void valorAlterado(String novoValor);
}
