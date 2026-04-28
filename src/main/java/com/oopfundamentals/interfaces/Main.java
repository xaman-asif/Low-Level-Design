package com.oopfundamentals.interfaces;

public class Main {
  public static void main(String[] args) {
    PaymentGateway stripePayment = new StripePayment();
    PaymentGateway razorPayment = new RazorPayment();

    double amount = 150.00;

    System.out.println("Processing payments:");
    stripePayment.initiatePayment(amount);
    razorPayment.initiatePayment(amount);
  }
}
