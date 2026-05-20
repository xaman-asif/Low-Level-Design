package com.oopfundamentals.polymorphism;

abstract class Notification {
  protected String recipient;
  protected String message;

  public Notification(String recipient, String message) {
    this.recipient = recipient;
    this.message = message;
  }

  abstract void send();
}
