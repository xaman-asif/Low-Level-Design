package com.designpattern.behaviouralpatterns.state;

public class OpenState implements IGateState {
  public Gate gate;

  public OpenState(Gate gate) {
    this.gate = gate;
  }

  public Gate getGate() {
    return gate;
  }

  public OpenState setGate(Gate gate) {
    this.gate = gate;
    return this;
  }

  @Override
  public void openGate() {
    System.out.println("The gate is already open....");
  }

  @Override
  public void closeGate() {
    gate.currentState = 1;
    System.out.println("The gate state is now opened from closed state");
  }

  @Override
  public void lockGate() {
    System.out.println("Please unlock the gate and open it....");
  }

  @Override
  public void unlockGate() {
    gate.currentState = 1;
    System.out.println("The gate is now unlocked and opened ");
  }
}
