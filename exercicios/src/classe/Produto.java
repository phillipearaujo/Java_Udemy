package classe;

public class Produto {
	
	String produto;
	double preco;
	static double desconto = 0.25;
	
	/*
	 *Abaixo criamos dois construtores com mesmo nome, mas assinaturas diferentes. 
	 * Eles definirão a forma que vamos criar(instanciar) os objetos. 
	 * No primeiro caso temos o construtor padrão, este não recebe nenhum parametro e ao criar a classe o 
	 * java automaticamente e implicitamente já o cria. Mas ao criarmos o segundo construtor com parâmetros
	 * somos obrigados a criar no código, agora de forma explícita.
	 * No segundo caso passamos todos os parametros necessários para a criação do objeto.
	 * Veja a diferença ao instanciar os objetos p1 e p2 no arquivo ProdutoTeste.java
	 */
	
	Produto(){
		
	}
	
	Produto(String produtoInicial, double precoInicial){
		produto = produtoInicial;
		preco = precoInicial;
	}
	
/*
 * Abaixo criamos 2 métodos com nomes iguais, mas com assinaturas diferentes (...)
 * Como nos objetos criados usaremos sempre a opção desconto, criamos os métodos para automatizar a 
 * chamada. Pode ser verifiado no arquivo ProdutoTeste.java.
 */
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoExtra) {
		return preco * (1 - desconto + descontoExtra);
	}

}
