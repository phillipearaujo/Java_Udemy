package colecoes;

import java.util.Objects;

public class ListaUsuario {
	
	String nome;
	
	ListaUsuario(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaUsuario other = (ListaUsuario) obj;
		return Objects.equals(nome, other.nome);
	}

}
