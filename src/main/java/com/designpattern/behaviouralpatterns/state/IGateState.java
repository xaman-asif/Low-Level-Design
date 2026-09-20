package com.designpattern.behaviouralpatterns.state;

public interface IGateState {
  void openGate();

  void closeGate();

  void lockGate();

  void unlockGate();
}
