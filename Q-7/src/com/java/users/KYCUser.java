package com.java.users;

public class KYCUser extends Users {
	 public KYCUser(int userId, String userName, String email, double walletBalance, double rewardPoints) {
	       super(userId, userName, email, walletBalance);
	       this.rewardPoints = rewardPoints;
	 }
	 
	 private double rewardPoints;
     @Override
     public boolean makePayment(double billAmount) {
         boolean paymentSuccessful = super.makePayment(billAmount);
         if (paymentSuccessful) {
             rewardPoints += billAmount * 0.1;
             System.out.println("Added " + (billAmount * 0.1) + " reward points.");
         }
         return paymentSuccessful;
     }

     public double getRewardPoints() {
         return rewardPoints;
     }
}
