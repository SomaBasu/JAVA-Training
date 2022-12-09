package com.java.globalsoftwaresupport;
import com.java.solid.entity.Employee;

public class SQLDatabase extends DatabaseController {
DatabaseController dbController;
	
	public SQLDatabase(DatabaseController dbController) {
		super(dbController.details.url, dbController.details.userName, dbController.details.password);
		this.dbController = dbController;
	}
	
	@Override
	public boolean connect() {
		return this.dbController.connect();
	}
	
	@Override
	public void executeQuery(String query, Employee e,int selection,int searchSelection) {
		this.dbController.executeQuery(query, e, selection, searchSelection);
	}
}
