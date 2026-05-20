package com.oopfundamentals.polymorphism;

public class SMSNotification extends Notification{

  private String phoneNumber;

  public SMSNotification(String recipient, String message, String phoneNumber) {
    super(recipient, message);
    this.phoneNumber = phoneNumber;
  }

  @Override
  void send() {
    System.out.println("Sending SMS to " + phoneNumber + " | Message: " + message);
  }
}
