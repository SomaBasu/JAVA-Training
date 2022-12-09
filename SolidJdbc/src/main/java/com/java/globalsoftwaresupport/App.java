package com.java.globalsoftwaresupport;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) {
		DatabaseController controller = new DatabaseController(new MySQLDatabase());
		controller.connect();
		controller.disconnect();
		
		System.out.println("Add New Employee"); 
		
		System.out.println("Add Employee:");

	       
	}
}
