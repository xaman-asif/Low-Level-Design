package com.oopfundamentals.polymorphism;

public class EmailNotification extends Notification {
  private String subject;

  public EmailNotification(String recipient, String message, String subject) {
    super(recipient, message);
    this.subject = subject;
  }

  @Override
  void send() {
    System.out.println("Sending EMAIL to " + recipient + " | Subject: " + subject);
  }
}
