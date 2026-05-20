package com.oopfundamentals.inheritance;

public class PushNotification extends Notification {
  private String deviceToken;
  private String priority;

  public PushNotification(String recipient, String message,
                          String deviceToken, String priority) {
    super(recipient, message);
    this.deviceToken = deviceToken;
    this.priority = priority;
  }

  @Override
  public void send() {
    System.out.println(formatHeader());
    System.out.println("Device: " + deviceToken.substring(0, 8) + "...");
    System.out.println("Priority: " + priority);
    System.out.println("Alert: " + message);
    System.out.println("Status: Push notification delivered");
  }
}
