package com.designpattern.structuralpatterns.flyweight;

public interface ISoldier {
  int healthStatus = 0;

  void move(int x1, int y1, int x2, int y2);
}
