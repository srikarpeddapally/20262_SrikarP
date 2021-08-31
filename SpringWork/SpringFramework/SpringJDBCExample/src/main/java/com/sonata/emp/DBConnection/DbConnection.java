package com.sonata.emp.DBConnection;

import java.sql.Connection;
import java.sql.*;

public class DbConnection {
	Connection connection;
	 
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "srikar");
			}
			catch(ClassNotFoundException e){System.out.println(e);}
			catch(SQLException s){System.out.println(s);}

			return connection;
	}
	
	public void closeConnection() {
		try {
			if(connection !=null) {
				connection.close();
			}
		}
		catch(SQLException sqle) {sqle.printStackTrace();}
	}

}
