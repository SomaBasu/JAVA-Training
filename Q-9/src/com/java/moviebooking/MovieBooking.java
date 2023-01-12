package com.java.moviebooking;

public class MovieBooking {
	private int movieId;
	private int noofTicket;
	private double totalAmount;
	private double discount;
	
	
	public MovieBooking(int movieId, int noofTicket) {
		//super();
		this.movieId = movieId;
		this.noofTicket = noofTicket;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getNoofTicket() {
		return noofTicket;
	}

	public void setNoofTicket(int noofTicket) {
		this.noofTicket = noofTicket;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void BookMyMOvie(int mid,int noofTicket )
	{
		movieId=mid;
		this.noofTicket=noofTicket;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static  double calculateDiscount(int id,int numberofticket)
	{
	  
	   	if(id==101||id==103&&(numberofticket>=5&&numberofticket<10))
	   	{
	   		return 15;
	   	}
	   	if(id==101||id==103&&(numberofticket>=10&&numberofticket<=15))
	   	{
	   		return 20;
	   	}
		if(id==102&&(numberofticket>=5&&numberofticket<10))
	   	{
	   		return 10;
	   	}
		if(id==102&&(numberofticket>=10&&numberofticket<=15))
	   	{
	   		return 15;
	   	}
		else
		{
			return 0;
		}
	}
	public static double claculateTicketAmount(int id,int numberofticket,int baseFare)
	{
		double discountPercetage=calculateDiscount(id,numberofticket);
		System.out.println("discount is"+ discountPercetage);
		return baseFare * numberofticket -(baseFare * numberofticket * (discountPercetage/100));		
	}
}
