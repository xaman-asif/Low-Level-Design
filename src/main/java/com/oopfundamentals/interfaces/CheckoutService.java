package com.oopfundamentals.interfaces;

public class CheckoutService {
  private PaymentGateway paymentGateway;

  public CheckoutService(PaymentGateway paymentGateway) {
    this.paymentGateway = paymentGateway;
  }

  public void setPaymentGateway(PaymentGateway paymentGateway) {
    this.paymentGateway = paymentGateway;
  }

  public void checkout(double amount) {
    System.out.println("Processing checkout...");
    paymentGateway.initiatePayment(amount);
    System.out.println("Checkout completed.");
  }
}
