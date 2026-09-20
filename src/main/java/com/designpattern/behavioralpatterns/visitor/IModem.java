package com.designpattern.behavioralpatterns.visitor;

public interface IModem {
  void connect();

  void disconnect();

  void accept(IModemVisitor modemVisitor);
}
