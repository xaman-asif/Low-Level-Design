package com.designpattern.behavioralpatterns.visitor;

public class AllModemConfigurator implements IModemVisitor {
  @Override
  public void visit(Grameen grameenModem) {
    grameenModem.connect();
    grameenModem.configureForWindows();
    grameenModem.disconnect();
  }

  @Override
  public void visit(Teletalk teletalkModem) {
    teletalkModem.connect();
    teletalkModem.configureForLinux();
    teletalkModem.disconnect();
  }

  @Override
  public void visit(Zoom zoomModem) {
    zoomModem.connect();
    zoomModem.configureForMac();
    zoomModem.disconnect();
  }

  @Override
  public void visit(Airtel airtelModem) {
    airtelModem.connect();
    airtelModem.configureForAndroid();
    airtelModem.disconnect();
  }
}
