package co.arum.newInterface;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class CountryDao {
	public Connection conn;
	
	private String driver;
	private String url;
	private String user;
	private String password;
	
	private void configProperties() throws IOException {
		Properties properties = new Properties();
		Reader reader = new FileReader("config/db.properties");
		properties.load(reader);
		driver = properties.getProperty("driver");
		url = properties.getProperty("url");
		user = properties.getProperty("user");
		password = properties.getProperty("password");
	}
	
	public CountryDao() {
		try {
			configProperties();
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (IOException | SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
