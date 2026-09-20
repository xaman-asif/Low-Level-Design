package com.designpattern.behaviouralpatterns.visitor;

public class Zoom implements IModem {
  @Override
  public void connect() {
    System.out.println("Zoom modem successfully connected");
  }

  @Override
  public void disconnect() {
    System.out.println("Zoom modem successfully disconnected");
  }

  @Override
  public void accept(IModemVisitor modemVisitor) {
    modemVisitor.visit(this);
  }

  public void configureForMac() {
    System.out.println("Configuring Zoom modem for Mac");
  }
}
