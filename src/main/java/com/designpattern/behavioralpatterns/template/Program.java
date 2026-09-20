package com.designpattern.behavioralpatterns.template;

public class Program {
  public static void main(String[] args) {
    EmailBase emailBase = new EmailGoogle();
    emailBase.sendEmail();

    EmailBase emailBase2 = new EmailYahoo();
    emailBase.sendEmail();
  }
}
