package jdbc;

import java.sql.SQLException;

public class DAOTeste {

	public static void main(String[] args) throws SQLException {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "José Medeiros")); 
		System.out.println(dao.incluir(sql, "Marta Rocha")); 
		System.out.println(dao.incluir(sql, "Nair de Melo")); 
		System.out.println(dao.incluir(sql, "Pablo Fonseca")); 
		
//		String sql = "DELETE FROM pessoas WHERE codigo = ?";
//		dao.delete(sql, 112);
//		dao.delete(sql, 113);
//		dao.delete(sql, 114);
//		dao.delete(sql, 115);
		
		dao.close();
	}
}
