package com.java.account;

public class Account {
	private int balance = 3000;
    int account_number;
    String name;
    
    public int balance() {
        return balance;
    }
    
    public void withdraw(int amount) throws InSufficientFundException {
        if (amount > balance) 
        System.out.println("insufficient funds");
        else
         balance = balance - amount;
    }

    public void deposit(int amount) {
        if (amount <= 0) 
          System.out.println("invalid amount");
         else
           balance=balance+amount;        
    }
}
