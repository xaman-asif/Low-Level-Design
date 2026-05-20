package com.oopfundamentals.inheritance;

public class EmailNotification extends Notification {
  private String subject;

  public EmailNotification(String recipient, String message, String subject) {
    super(recipient, message);
    this.subject = subject;
  }

  @Override
  public void send() {
    System.out.println(formatHeader());
    System.out.println("Subject: " + subject);
    System.out.println("Body: " + message);
    System.out.println("Status: Email delivered");
  }
}
