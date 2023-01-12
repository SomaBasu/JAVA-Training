package com.java.users;

public class RunApp {
	public static void main(String[] args) {
        Users user1 = new Users(1,"Soma","soma@gmail.com",103);
        Wallet.processPaymentByUser(user1, 50);

        KYCUser user2 = new KYCUser(2,"Basu","basu@gmail.com",1008,11);
        Wallet.processPaymentByUser(user2, 75);
    }
}
