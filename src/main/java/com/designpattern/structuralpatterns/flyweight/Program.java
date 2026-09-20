package com.designpattern.structuralpatterns.flyweight;

public class Program {
  public static void main(String[] args) {
    ISoldier iSoldier;

    for (int i = 0; i < 5; i++) {
      iSoldier = SoldierFactory.getSoldier(SoldierType.SONNASI);
    }

    System.out.println(Sonnasi.objectCount);

    for (int i = 0; i < 5; i++) {
      iSoldier = SoldierFactory.getSoldier(SoldierType.ASUR);
    }

    System.out.println(Asur.objectCount);
  }
}