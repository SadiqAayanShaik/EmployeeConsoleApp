package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBC_Connection {
	
	private Connection connection = null;

	public Connection getConnection() throws SQLException {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/casestudy", "root", "1234");
			System.out.println("Connected...........");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your Mysql JDBC Driver?");
			e.printStackTrace();

		}

		return connection;

	}

}
