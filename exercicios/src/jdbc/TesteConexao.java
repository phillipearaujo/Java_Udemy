package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException{
		
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		final String user = "root";
		final String password = "12345678";
		
		Connection conexao = DriverManager
				.getConnection(url, user, password);
		
		System.out.println("Conectado com sucesso!!!");
		conexao.close();
	}
}

/*
 * Quando utlizamos a porta de conexão padrão com o MySQL (3306) não temos há necessidade de 
 * colocarmos de forma explícita como foi feito na url acima.
 * verifyServerCertificate=false ==> indica a conexão que deve ignorar a verificação de certificado
 * segurança do servidor.
 * useSSL=true ==> faz com que seja utilizada uma conexão segura mesmo não verificando o certificado
 * 
 */
