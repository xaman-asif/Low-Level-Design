package com.designpattern.behaviouralpatterns.strategy;

import java.util.Random;

public class Program {
  public static void main(String[] args) {
    Fighter fighter = new Fighter();
    Random random = new Random();

    fighter.health = random.nextInt(99);

    if (fighter.health <= 50) {
      fighter.changeMood(new Defensive());
    } else {
      fighter.changeMood(new Aggressive());
    }
  }
}
