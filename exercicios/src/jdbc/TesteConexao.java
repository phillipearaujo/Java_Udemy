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
 * Quando utlizamos a porta de conex�o padr�o com o MySQL (3306) n�o temos h� necessidade de 
 * colocarmos de forma expl�cita como foi feito na url acima.
 * verifyServerCertificate=false ==> indica a conex�o que deve ignorar a verifica��o de certificado
 * seguran�a do servidor.
 * useSSL=true ==> faz com que seja utilizada uma conex�o segura mesmo n�o verificando o certificado
 * 
 */
