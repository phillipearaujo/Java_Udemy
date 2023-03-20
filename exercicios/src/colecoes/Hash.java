package colecoes;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<ListaUsuario> usuarios = new HashSet<>();
		
		usuarios.add(new ListaUsuario("Pedro"));
		usuarios.add(new ListaUsuario("Ana"));
		usuarios.add(new ListaUsuario("Guilherme"));
		
		boolean resultado = usuarios.contains(new ListaUsuario("Guilherme"));
		System.out.println(resultado);
		
	}
/*
 * Quando realizamos uma busca pelo dados inseridos em uma lista, pilha, etc. é considarado
 * boa prática a utlização do hash juntamente com o equals. O hash fará uma primeira varredura
 * no banco de dados buscando eliminar valores que não possuam chances de um resultado verdadeiro
 * fazendo comparações muito mais rápidas que o equals utilizando parametros como tamanho(.length)
 * deixando para o equals a responsabilidade de fazer o pente fino e retornar o resultado.
 * Caso utlizasse apenas o equals o resultado seria muito lento e consumiria um alto valor 
 * de memória. Destalhes do exemplo abaixo:
 *  
 * Na classe ListaUsuario está criado de forma automática pelo java o hashCode e o equals.
 * Em caso de ausência do hashCode, mesmo com o equals empregado o resultado sera false
 * por o retorno de busca do hashCode será false mesmo tendo o valor pesquisado na lista.
 * Para testar vá até a classe ListaUsuario e comente apenas o código referente ao hashCode 
 * e rode o programa.
 */
}
