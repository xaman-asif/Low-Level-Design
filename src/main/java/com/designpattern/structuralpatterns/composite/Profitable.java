package com.designpattern.structuralpatterns.composite;

public interface Profitable {
  int getProfit();

  void addChild(Profitable profitable);

  void removeChild(Profitable profitable);
}
