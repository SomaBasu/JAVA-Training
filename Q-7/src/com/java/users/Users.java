package com.java.users;

public class Users {
	private int userId;
    private String userName;
    private String email;
    private double walletBalance;
    
	public Users() {
		super();
	}

	public Users(int userId, String userName, String email, double walletBalance) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.walletBalance = walletBalance;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	
	public boolean makePayment(double billAmount) {
        if (walletBalance < billAmount) {
            System.out.println("Error: Not enough balance in wallet.");
            return false;
        }
        walletBalance -= billAmount;
        System.out.println("Payment of $" + billAmount + " processed successfully.");
        return true;
    }
    
    
}
