package com.java.users;

public class Wallet {
	public static void processPaymentByUser(Users user, double billAmount) {
        boolean paymentSuccessful = user.makePayment(billAmount);
        if (paymentSuccessful) {
            System.out.println("Current wallet balance: $" + user.getWalletBalance());
            if (user instanceof KYCUser) {
              KYCUser kycUser = (KYCUser) user;
              System.out.println("Reward points: " + kycUser.getRewardPoints());
            }
            else 
              System.out.println("you are not eligible for reward points");
            }
        }
}
