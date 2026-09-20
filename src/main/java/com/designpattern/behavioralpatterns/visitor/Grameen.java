package com.designpattern.behavioralpatterns.visitor;

public class Grameen implements IModem {
  @Override
  public void connect() {
    System.out.println("Grameen modem successfully connected");
  }

  @Override
  public void disconnect() {
    System.out.println("Grameen modem successfully disconnected");
  }

  @Override
  public void accept(IModemVisitor modemVisitor) {
    modemVisitor.visit(this);
  }

  public void configureForWindows() {
    System.out.println("Configuring Grameen modem for Windows");
  }
}
