package com.designpattern.behaviouralpatterns.template;

public abstract class EmailBase {

  public final void sendEmail() {
    checkEmailAddress();
    validateMessage();
    sendMail();
  }

  protected abstract void sendMail();

  protected abstract void validateMessage();

  protected abstract void checkEmailAddress();
}
