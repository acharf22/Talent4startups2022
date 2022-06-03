package br2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connexion {
	public Connection conn;
	public Connection connect ()  {
		

		String url = "jdbc:postgresql://localhost:5432/DbBrief5";
		String username = "postgres";
		String password = "Sarle2018";
		
		
		try {	
			System.out.println("Connected");
			return DriverManager.getConnection(url, username, password);

			//conn.close();

		} catch (SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		return null;
	}
	




}
