package com.designpattern.behavioralpatterns.strategy;

public class Fighter {
  public int health;
  private IFighter _fighter;

  public void changeMood(IFighter fighter) {
    _fighter = fighter;
    _fighter.fight();
  }
}
