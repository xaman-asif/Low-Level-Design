package com.designpattern.behaviouralpatterns.template;

public class EmailGoogle extends EmailBase {

  protected void sendMail() {
    System.out.println("Sending Email : GoogleEmail");
  }

  protected void validateMessage() {
    System.out.println("Validating Email Message : GoogleEmail");
  }

  protected void checkEmailAddress() {
    System.out.println("Checking Email Address : GoogleEmail");
  }
}
