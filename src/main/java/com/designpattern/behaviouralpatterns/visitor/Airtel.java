package com.designpattern.behaviouralpatterns.visitor;

public class Airtel implements IModem {
  @Override
  public void connect() {
    System.out.println("Airtel modem successfully connected");
  }

  @Override
  public void disconnect() {
    System.out.println("Airtel modem successfully disconnected");
  }

  @Override
  public void accept(IModemVisitor modemVisitor) {
    modemVisitor.visit(this);
  }

  public void configureForAndroid() {
    System.out.println("Configuring Airtel modem for Android");
  }
}
