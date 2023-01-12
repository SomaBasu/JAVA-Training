package com.java.moviebooking;

public class Movie {
private int  movid;
	
	public int getMovid() {
		return movid;
	}

	public Movie(int movid, int price) {
		//super();
		this.movid = movid;
		Price = price;
	}

	public void setMovid(int movid) {
		this.movid = movid;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	private int Price;
}
