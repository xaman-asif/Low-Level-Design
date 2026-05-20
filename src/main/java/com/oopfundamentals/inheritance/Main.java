package com.oopfundamentals.inheritance;

public class Main {
  public static void main(String[] args) {
    EmailNotification email = new EmailNotification(
        "alice@example.com", "Your order has been shipped!", "Order Update");
    email.send();

    System.out.println();

    SMSNotification sms = new SMSNotification(
        "Bob", "Your verification code is 482910.", "+1-555-0123");
    sms.send();

    System.out.println();

    PushNotification push = new PushNotification(
        "Charlie", "New message from Alice",
        "d8a3f4b2c1e5a9b7", "high");
    push.send();
  }
}
