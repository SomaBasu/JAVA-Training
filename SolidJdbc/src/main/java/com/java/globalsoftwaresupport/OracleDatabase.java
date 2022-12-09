package com.java.globalsoftwaresupport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDatabase implements Database {
	
    
	@Override
	public Connection connect() {		
		System.out.println("Connecting to an Oracle database...");
		return null;
	}
	
	@Override
	public void disconnect() {
		System.out.println("Disconnecting the Oracle database...");
	}
}
