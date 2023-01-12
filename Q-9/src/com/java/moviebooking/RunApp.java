package com.java.moviebooking;

import java.util.Scanner;

public class RunApp {
	public static void main(String[] args) {
		
		Movie[] movie = new Movie[3];
		movie[0]= new Movie(101,120);
		movie[1]= new Movie(102,170);
		movie[2]= new Movie(103,150);
		System.out.println("Enter movid and and no.of ticket");
		Scanner sc1= new Scanner(System.in);
		int id=sc1.nextInt();
		Scanner sc2=new Scanner(System.in);
		int numTicket=sc2.nextInt();
		if(numTicket<15)
		{
			
		
		int c=0;
		int price=0;
		for(int i= 0; i<3;i++)
		{
			if(movie[i].getMovid()==id)
			{
			c++;
			 price=movie[i].getPrice();
			
			}
		}
		if(c!=1)
		{
			System.out.println("movid not present");
		}
		else if (c==1)
		{
			 double totalAmount=MovieBooking.claculateTicketAmount(id,numTicket,price);
			 System.out.println("Total amount for booking \n" + totalAmount);
		}
		}
		else {
			System.out.println("more than 15 ticket can not be booked");
		}	
}
}
