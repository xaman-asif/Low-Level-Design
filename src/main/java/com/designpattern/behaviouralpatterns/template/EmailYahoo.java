package com.designpattern.behaviouralpatterns.template;

public class EmailYahoo extends EmailBase {

  protected void sendMail() {
    System.out.println("Sending Email : YahooEmail");
  }

  protected void validateMessage() {
    System.out.println("Validating Email Message : YahooEmail");
  }

  protected void checkEmailAddress() {
    System.out.println("Checking Email Address : YahooEmail");
  }
}
