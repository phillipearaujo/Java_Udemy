package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o código para exclusão: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FactureConnection.getConnection();
		String deleteSQL = "DELETE FROM pessoas WHERE codigo >= ?";
		
		PreparedStatement stmt = conexao.prepareStatement(deleteSQL); 
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		if(contador > 0) {
			System.out.println("Registro excluído com sucesso!");
		}else {
			System.out.println("Nada feito");
		}
		System.out.println("Linhas afetadas: " + contador);
		
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
