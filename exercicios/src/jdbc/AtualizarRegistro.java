package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarRegistro {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o c�digo de registro: ");
		int id = entrada.nextInt();

		String selectSQL = "SELECT codigo, nome FROM pessoas WHERE codigo = ?"; //1� => realizar filtro

		Connection conexao = FactureConnection.getConnection(); // abrir conex�o com o banco de dados

		PreparedStatement stmt = conexao.prepareStatement(selectSQL);
		stmt.setInt(1, id);
		ResultSet resultado = stmt.executeQuery();

		if (resultado.next()) { // 2� => se registro localizado
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2)); //cria nova pessoa e...

			System.out.println("Nome atual: " + p.getNome()); // mostra o nome atual
			entrada.nextLine();

			System.out.print("Informe o novo nome: "); // 3� => informa o novo nome
			String novoNome = entrada.nextLine();

			String updateSQL = "UPDATE pessoas SET nome = ? WHERE codigo = ?"; //4� => criar o update

			stmt.close(); // encerrado o statement usado na pesquisa para usar a mesma vari�vel abaixo
			
			stmt = conexao.prepareStatement(updateSQL); // statement para atualizar
			stmt.setString(1, novoNome); // setando o novo nome
			stmt.setInt(2, id); // setando o c�digo informado pelo usu�rio na busca
			stmt.execute(); // executando o statement updateSQL

			System.out.print("Atualizado com sucesso");

		} else {
			System.out.println("C�digo informado n�o localizado!");
		}
		
		stmt.close();
		conexao.close();
		entrada.close();

	}
}
