package com.jdbc.connection;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConn {
	static Connection con;
	public Connection createConnection() throws SQLException {
		try {
        	Class.forName("com.mysql.jdbc.Driver");

        	 String url = "jdbc:mysql://localhost:3306/test";
 	        String username = "root";
 	        String password = "";
 	        
            con = DriverManager.getConnection(url, username, password);

		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}
