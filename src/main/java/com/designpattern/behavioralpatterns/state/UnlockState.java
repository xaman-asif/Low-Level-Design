package com.designpattern.behavioralpatterns.state;

public class UnlockState implements IGateState {
  public Gate gate;

  public UnlockState(Gate gate) {
    this.gate = gate;
  }

  @Override
  public void openGate() {
    System.out.println("The gate is open, cannot be unlocked.....");
  }

  @Override
  public void closeGate() {
    System.out.println("The gate is close, cannot be unlocked....");
  }

  @Override
  public void lockGate() {
    gate.currentState = 2;
    System.out.println("The gate is unlocked, but it is closed...");
  }

  @Override
  public void unlockGate() {
    System.out.println("The gate is unlocked already...Cannot unlock again");
  }
}
