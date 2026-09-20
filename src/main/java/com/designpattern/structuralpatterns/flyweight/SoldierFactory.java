package com.designpattern.structuralpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SoldierFactory {
  private static final Map<Enum, ISoldier> soldierContainer = new HashMap<>();

  public static ISoldier getSoldier(SoldierType soldierType) {
    ISoldier soldier = null;

    if (soldierType == SoldierType.ASUR) {
      if (!soldierContainer.containsKey(soldierType)) {
        soldier = new Asur(100);
        soldierContainer.put(soldierType, soldier);
      }
      soldier = soldierContainer.get(soldierType);
    } else if (soldierType == SoldierType.SONNASI) {
      if (!soldierContainer.containsKey(soldierType)) {
        soldier = new Sonnasi(100);
        soldierContainer.put(soldierType, soldier);
      }
      soldier = soldierContainer.get(soldierType);
    }
    return soldier;
  }
}
