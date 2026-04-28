package com.oopfundamentals.enums;

public class Order {
  private final String orderId;
  private OrderStatus status;
  private final PaymentMethod paymentMethod;
  private final double amount;

  public Order(String orderId, PaymentMethod paymentMethod, double amount) {
    this.orderId = orderId;
    this.paymentMethod = paymentMethod;
    this.amount = amount;
    this.status = OrderStatus.PLACED;
  }

  public boolean advanceStatus() {
    switch (status) {
      case PLACED -> status = OrderStatus.CONFIRMED;
      case CONFIRMED -> status = OrderStatus.SHIPPED;
      case SHIPPED -> status = OrderStatus.DELIVERED;
      case DELIVERED, CANCELLED -> {
        return false;
      }
    }
    return false;
  }

  public boolean cancel() {
    if (status == OrderStatus.PLACED || status == OrderStatus.CONFIRMED) {
      status = OrderStatus.CANCELLED;
      return true;
    }

    return false;
  }

  public double getTotalWithFees() {
    return amount + (amount * paymentMethod.getFeePercent() / 100);
  }

  public void displayInfo() {
    System.out.printf("Order %s | Status: %s | Payment: %s | Amount: $%.2f (with fees: $%.2f)%n",
        orderId, status, paymentMethod.getDisplayName(), amount, getTotalWithFees());
  }
}
