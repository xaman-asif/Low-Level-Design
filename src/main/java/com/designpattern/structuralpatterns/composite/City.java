package com.designpattern.structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class City implements Profitable {
  public List<Profitable> storeList;
  public int id;
  public String name;

  public City(int id, String name) {
    storeList = new ArrayList<>();
    this.id = id;
    this.name = name;
  }

  @Override
  public int getProfit() {
    int totalProfit = 0;

    for (Profitable store : storeList) {
      totalProfit += store.getProfit();
    }

    return totalProfit;
  }

  @Override
  public void addChild(Profitable profitable) {
    if (profitable instanceof Store) {
      storeList.add(profitable);
    }
  }

  @Override
  public void removeChild(Profitable profitable) {
    if (profitable instanceof Store) {
      storeList.remove(profitable);
    }
  }
}
