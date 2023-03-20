package modelo.umpraum;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "assento_id", unique = true)
	private Assento assento;

	public Cliente() {
		
	}

	public Cliente(String nome, Assento assento) {
		super();
		this.nome = nome;
		this.assento = assento;
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

	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}
	
	/*
	 * Nesta classe estamos trabalhando fortemente com as @Annotations. Abaixo ser�o
	 * detalhadas todas que forem utilizadas neste exerc�cio.
	 * @Entity -> obrigat�ria em todo JPA.
	 * @Table -> permite realizar altera��es na tabela como o nome.
	 * @Id -> indoca qual atributo ser� a primary key. Tamb�m obrigat�rio.
	 * @GeneratedValue -> (strategy)define a estrat�gia que ser� adotada na gera��o da primary key.
	 * @OneToOne -> define relacionamento 1 pra 1 entre as classes.
	 * 			(cascade) -> atributo que permite realizar opera�oes em cascata. Para m�ltiplas
	 * 			opera��es coloque as solicita��es dentro de {}.
	 * @JoinColumn -> realiza o mapeamento da coluna permitindo realizar alter��es como nome e
	 * 				caracter�sticas como unique que n�o haja valor repetido.
	 */

}
