package com.oopfundamentals.interfaces;

public class RazorPayment implements PaymentGateway {
  @Override
  public void initiatePayment(double amount) {
    System.out.println("Initiating Razorpay payment of $" + amount);
  }
}
