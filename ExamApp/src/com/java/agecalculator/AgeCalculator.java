package com.java.agecalculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {

	public static void main(String args[])		
		{
			String date = "2/11/1990";
	        
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
	        LocalDate birthdate = LocalDate.parse(date, formatter);
	        System.out.println(birthdate);	
	
	        Period period = Period.between(birthdate, LocalDate.now());	        
	        System.out.println("You are "+period.getYears()+" years, "+period.getMonths()+" months and "+period.getDays()+" days old.");
		}
}
