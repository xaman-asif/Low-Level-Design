package com.oopfundamentals.enums;

public class Main {
  public static void main(String[] args) {
    Order order = new Order("ORD-001",PaymentMethod.CREDIT_CARD, 99.99);

    order.displayInfo();

    order.advanceStatus();
    order.advanceStatus();
    order.displayInfo();

    System.out.println("Cancel after shipping: " + order.cancel());
  }
}
