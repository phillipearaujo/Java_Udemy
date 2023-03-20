package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarRegistro {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o código de registro: ");
		int id = entrada.nextInt();

		String selectSQL = "SELECT codigo, nome FROM pessoas WHERE codigo = ?"; //1º => realizar filtro

		Connection conexao = FactureConnection.getConnection(); // abrir conexão com o banco de dados

		PreparedStatement stmt = conexao.prepareStatement(selectSQL);
		stmt.setInt(1, id);
		ResultSet resultado = stmt.executeQuery();

		if (resultado.next()) { // 2º => se registro localizado
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2)); //cria nova pessoa e...

			System.out.println("Nome atual: " + p.getNome()); // mostra o nome atual
			entrada.nextLine();

			System.out.print("Informe o novo nome: "); // 3º => informa o novo nome
			String novoNome = entrada.nextLine();

			String updateSQL = "UPDATE pessoas SET nome = ? WHERE codigo = ?"; //4º => criar o update

			stmt.close(); // encerrado o statement usado na pesquisa para usar a mesma variável abaixo
			
			stmt = conexao.prepareStatement(updateSQL); // statement para atualizar
			stmt.setString(1, novoNome); // setando o novo nome
			stmt.setInt(2, id); // setando o código informado pelo usuário na busca
			stmt.execute(); // executando o statement updateSQL

			System.out.print("Atualizado com sucesso");

		} else {
			System.out.println("Código informado não localizado!");
		}
		
		stmt.close();
		conexao.close();
		entrada.close();

	}
}
