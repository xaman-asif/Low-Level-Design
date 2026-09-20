package com.designpattern.behavioralpatterns.visitor;

public class Teletalk implements IModem {
  @Override
  public void connect() {
    System.out.println("Teletalk modem successfully connected");
  }

  @Override
  public void disconnect() {
    System.out.println("Teletalk modem successfully disconnected");
  }

  @Override
  public void accept(IModemVisitor modemVisitor) {
    modemVisitor.visit(this);
  }

  public void configureForLinux() {
    System.out.println("Configuring Teletalk modem for Linux");
  }
}
