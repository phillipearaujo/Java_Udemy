package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", "Sampaio", 45);
//			p1.setIdade(443);
			p1.setNome("Maria");
			
			System.out.println(p1.getIdade());
			System.out.println(p1.getNome());
			System.out.println(p1.toString()); // chamando o método toString na classe pessoa
			System.out.println(p1.getNomeCompleto());
	}

}
