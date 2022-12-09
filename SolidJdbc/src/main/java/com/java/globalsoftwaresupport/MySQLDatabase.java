package com.java.globalsoftwaresupport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDatabase implements Database {

	private final String url = "jdbc:mysql://localhost:3306/demo";
    private final String user = "root";
    private final String password = "DataGuard432$";
    
	@Override
	public Connection connect() {
		Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
	}
	
	@Override
	public void disconnect() {
		System.out.println("Disconnecting the MySQL database...");
	}
	
}
