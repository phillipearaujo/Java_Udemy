package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FactureConnection {
	
	public static Connection getConnection() {
		
		try {
			Properties prop = getProperties();
			final String url = prop.getProperty("dataBase.url");
			final String user = prop.getProperty("dataBase.user");
			final String password = prop.getProperty("dataBase.password");
			
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FactureConnection.class.getResourceAsStream(caminho));
		return prop;
	}

}
