package com.designpattern.behavioralpatterns.visitor;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    IModemVisitor modemVisitor = new AllModemConfigurator();

    List<IModem> modemList = List.of(new Grameen(), new Teletalk(), new Zoom(), new Airtel());

    for (var modem : modemList) {
      modem.accept(modemVisitor);
    }
  }
}
