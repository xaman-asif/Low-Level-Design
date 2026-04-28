package com.oopfundamentals.interfaces;

public class StripePayment implements PaymentGateway{
  @Override
  public void initiatePayment(double amount) {
    System.out.printf("Initiating Stripe payment of $%.2f%n", amount);
  }
}
