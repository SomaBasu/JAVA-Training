package com.java.emparrylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class EmployeesTest {

	public static void main(String[] args) {
		ArrayList<Employees> empList = new ArrayList<Employees>();
		empList.add(new Employees(1, "John", 1000d));
		empList.add(new Employees(2, "Mariana", 2000d ));
		empList.add(new Employees(3, "Luke", 3000d ));
		empList.add(new Employees(4, "Haide", 4000d ));
		
		System.out.println("-- For --");
		for (int i=0; i<empList.size(); i++) {
			System.out.println(empList.get(i));
		}
		
		System.out.println("-- For each --");
		empList.forEach(emp->System.out.println(emp));
		
		System.out.println("-- Stream --");
		empList.stream().forEach(emp->System.out.println(emp));
		
		System.out.println(" -- Employees Sort by Name --");
		Collections.sort(empList);
		empList.forEach(emp->System.out.println(emp));
		
		System.out.println(" -- Employees Name in Uppercase --");
		empList.stream().map(emp->emp.getEmpName().toUpperCase()).forEach(System.out::println);
		
		System.out.println("-- Employees Average salary -- ");		
		System.out.println(empList.stream().mapToDouble(emp-> emp.getEmpSalary()).average().getAsDouble());
		
		System.out.println("-- Employees name Sort using Stream --");
		empList.stream().sorted().forEach(emp-> System.out.println(emp));
		
		System.out.println(" -- Forward Direction --");
		ListIterator<Employees> itr = empList.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-- Reverse Direction --");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
			
		}
	}
}
