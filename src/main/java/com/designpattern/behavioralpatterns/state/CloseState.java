package com.designpattern.behavioralpatterns.state;

public class CloseState implements IGateState {
  public Gate gate;

  public CloseState(Gate gate) {
    this.gate = gate;
  }

  public Gate getGate() {
    return gate;
  }

  public CloseState setGate(Gate gate) {
    this.gate = gate;
    return this;
  }

  @Override
  public void openGate() {
    gate.currentState = 2;
    System.out.println("The gate has been closed successfully........");
  }

  @Override
  public void closeGate() {
    System.out.println("The gate is already closed. You cannot close it again!!");
  }

  @Override
  public void lockGate() {
    System.out.println("The gate is locked. So you cannot close this gate!!\"");
  }

  @Override
  public void unlockGate() {
    System.out.println("The gate is unlocked, so it is already closed!!!!");
  }
}
