package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
	final String url = "jdbc:mysql://localhost?verifyServeCertificate=false&useSSL=true";
	final String user = "root";
	final String password = "12345678";
	
	Connection conexao = DriverManager
			.getConnection(url, user, password);
	
	Statement stmt = conexao.createStatement();
	stmt.execute("CREATE DATABASE curso_java");
	
	System.out.println("Criado DB!");
	conexao.close();
	}
}

/*
 * ao final do comando para criar o banco de dados podemos adicionar IF NOT EXISTS para evitar 
 * o erro 'DataBase Exists' ficando o comando final "CREATE DATABASE IF NOT EXISTS curso_java".
 * Dessa forma evitamos apenas o erro se caso tentarmos criar um BD com o mesmo nome, já que o
 * próprio MySQL não permite duplicidade.
 * 
 */
