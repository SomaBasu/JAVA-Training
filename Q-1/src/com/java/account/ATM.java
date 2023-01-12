package com.java.account;

public class ATM {

	public static void main(String[] args) {
		Account acct = new Account();
        System.out.println("Current balance : " + acct.balance());
        try {
			acct.withdraw(200);
		} catch (InSufficientFundException e) {
			e.printStackTrace();
		}
        System.out.println("After withdrwal balance : " + acct.balance());
        acct.deposit(3500);
        System.out.println("Final balance : " + acct.balance());
	}

}
