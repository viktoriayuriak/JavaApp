package net.viralpatel.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	private static String JDBC_CONNECTION_URL = "jdbc:postgresql://localhost:5432/Web";

	
	public static void main(String args[]) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = null;
			connection = DriverManager.getConnection(JDBC_CONNECTION_URL, "postgres", "postgres");
			CSVLoader loader = new CSVLoader(connection);
			loader.loadCSV("E:\\TestData.csv", "transaction", true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
public static void convert(){
	try {
		Class.forName("org.postgresql.Driver");
		Connection connection = null;
		connection = DriverManager.getConnection(JDBC_CONNECTION_URL, "postgres", "postgres");
		CSVLoader loader = new CSVLoader(connection);
		loader.loadCSV("C:\\TestData.csv", "transaction", true);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	private static Connection getCon() {
		Connection connection = null;
		try {
			//Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(JDBC_CONNECTION_URL, "postgres", "postgres");

		} catch (Exception e) {
			e.printStackTrace();
		} 

		return connection;
	}
}
