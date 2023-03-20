package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {

	private final Set<Par<C, V>> itens = new LinkedHashSet<>();
		//utilzando o tipo 'Set' não teremos pares com chaves repetidas
		//'LinkedHashSet' garante a ordem seguindo a sequencia de inclusão na lista
	
	public void adicionar(C chave, V valor) {
		if(chave == null) return; // neste caso se chave = null o codigo é interrompido.
		
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		if(itens.contains(novoPar)) { // encontrando uma chave repetida, será excluido
			itens.remove(novoPar); 	  // o par e adicionado novamente com o novo valor
		}						   
		itens.add(novoPar);
	}
	
	public V getValor(C chave) {
		if(chave == null) return null;
		
		Optional<Par<C, V>> parOpcional = itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		
		return parOpcional.isPresent()? parOpcional.get().getValor() : null;
	}
}
