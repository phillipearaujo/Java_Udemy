package classe.desafio;

public class Pessoa {
	
	String nome;
	double pesoPessoa;
	
	Pessoa(String nome, double pesoPessoa) {
	this.nome = nome;
	this.pesoPessoa = pesoPessoa;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.pesoPessoa += comida.pesoComida;
		}
	}
	
	String apresentar() {
		return "Olá eu sou o " + nome + " e tenho " + pesoPessoa + " Kg.\n";
	}
	
}
