package classe;

public class Data {
	
	/*
	 * Valores padrão das variáveis primitivas
	 * 
	 * byte,short,int,long -> 0
	 * float, double -> 0.0
	 * boolean -> false
	 * char -> '\u0000'  tabela uni code
	 * 
	 * O valor padrão é atribuido apenas quando a variável pertencer a classe. Quando criadas dentro de métodos ou
	 * construtores é necessário que sejam inicializadas atribuindo a elas valores e caso não sejam inicializadas
	 * ficam indisponíveis para uso.
	 * 
	 * Quando criamos uma variável com valor constante ( final int x;) obrigatóriamente devemos inicializa-la
	 * atribuindo a ela um valor independente se a mesma pertença a classe ou dentro de construtores
	 * e/ou metodos.
	 * 
	 * Todo objeto por padrão recebe o valor 'null'
	 */
	
	int dia;
	int mes;
	int ano;
	
	Data(){
//		dia = 01;
//		mes = 01;
//		ano = 1970;
		this(01, 01, 1970); //neste caso usamos o 'this.' para chamar um construtor a partir de outro construtor
	}						// tendo o mesmo efeito que as linha comentadas acima.
	
	Data(int dia, int mesSet, int anoSet){
		this.dia = dia;//pode ser usado o mesmo nome da variável apenas colocando 'this.' para evitar o conflito.
		mes = mesSet;
		ano = anoSet;
	}
	
/*
 * Abaixo foi criado um método para padronizar a formatação da data. Neste caso o padrão brasileiro.
 * Ao imprimir o resultado no console podemos chamar diretamente o método como pode ser visto no
 * arquivo DataTeste.java.
 * Pdemos utilizar o 'return' das 2 formas abaixo. Para testar comente uma das linhas e execute o programa.
 */
	
	String obterDataFormatada () {
		return String.format("%d/%d/%d",this.dia,mes,ano );
	  //return(dia +"/"+ mes +"/"+ ano );
	}
}

