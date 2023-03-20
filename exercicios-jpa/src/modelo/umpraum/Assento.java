package modelo.umpraum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "assentos")
public class Assento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	
	@OneToOne(mappedBy = "assento")
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Assento() {

	}

	public Assento(String nome) {
		super();
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/*
	 * Na classe cliente foi detalhado parte das @Annotation utilizadas em comum entre 
	 * as classes Assento/Cliente.
	 * Nessa classe particularmente utilizamos também a notação @OneToOne adicionando a 
	 * ela o atributo mappedBy para referenciar ao atributo assento que foi definido como
	 * a chave do relacionamento 1/1. Agora temos ttemos um relacionamento bi-direcional
	 * onde podemos fazer querys pelo cliente buscando o assento correspondente e tambem
	 * pelo assento buscando o cliente correspondente como feito no exercicio 
	 * ObterClienteAssento.
	 */

}
