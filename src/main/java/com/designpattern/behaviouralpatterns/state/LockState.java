package com.designpattern.behaviouralpatterns.state;

public class LockState implements IGateState {
  public Gate gate;

  public LockState(Gate gate) {
    this.gate = gate;
  }

  public Gate getGate() {
    return gate;
  }

  public LockState setGate(Gate gate) {
    this.gate = gate;
    return this;
  }

  @Override
  public void openGate() {
    System.out.println("Please Close the Gate first and then lock it..");
  }

  @Override
  public void closeGate() {
    gate.currentState = 3;
    System.out.println("The Gate has been locked successfully..");
  }

  @Override
  public void lockGate() {
    System.out.println("The gate is already locked, cannot lock again");
  }

  @Override
  public void unlockGate() {
    gate.currentState = 3;
    System.out.println("The gate went to  Locked state from Unlocked state...");
  }
}
