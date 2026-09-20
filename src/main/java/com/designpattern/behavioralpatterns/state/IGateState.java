package com.designpattern.behavioralpatterns.state;

public interface IGateState {
  void openGate();

  void closeGate();

  void lockGate();

  void unlockGate();
}
