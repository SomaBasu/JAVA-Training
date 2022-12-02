package com.java.emparrylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class EmployeesTest {
	
	static Log logger = LogFactory.getLog(EmployeesTest.class);
	

	public static void main(String[] args) {
		ArrayList<Employees> empList = new ArrayList<Employees>();
		empList.add(new Employees(1, "John", 1000d));
		empList.add(new Employees(2, "Mariana", 2000d ));
		empList.add(new Employees(3, "Luke", 3000d ));
		empList.add(new Employees(4, "Haide", 4000d ));
		
		logger.info("-- For --");		
		for (int i=0; i<empList.size(); i++) {			
			logger.info("Employees List: "+empList.get(i));
		}		
	}
}
