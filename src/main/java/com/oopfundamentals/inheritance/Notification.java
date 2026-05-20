package com.oopfundamentals.inheritance;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Notification {
  protected String recipient;
  protected String message;
  protected String timestamp;

  public Notification(String recipient, String message) {
    this.recipient = recipient;
    this.message = message;
    this.timestamp = LocalDateTime.now()
        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
  }

  public String formatHeader() {
    return "[" + timestamp + "] To: " + recipient;
  }

  public void send() {
    System.out.println(formatHeader());
    System.out.println("Message: " + message);
  }
}
