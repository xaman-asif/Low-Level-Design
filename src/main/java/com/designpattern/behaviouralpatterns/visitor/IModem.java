package com.designpattern.behaviouralpatterns.visitor;

public interface IModem {
  void connect();

  void disconnect();

  void accept(IModemVisitor modemVisitor);
}
