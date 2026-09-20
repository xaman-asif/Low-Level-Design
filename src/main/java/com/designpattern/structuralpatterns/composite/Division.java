package com.designpattern.structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Division implements Profitable {
  public List<Profitable> cityList;
  public int id;
  public String name;

  public Division(int id, String name) {
    cityList = new ArrayList<>();
    this.id = id;
    this.name = name;
  }

  @Override
  public int getProfit() {
    int totalProfit = 0;

    for (Profitable city : cityList) {
      totalProfit += city.getProfit();
    }

    return totalProfit;
  }

  @Override
  public void addChild(Profitable profitable) {
    if (profitable instanceof City) {
      cityList.add(profitable);
    }
  }

  @Override
  public void removeChild(Profitable profitable) {
    if (profitable instanceof City) {
      cityList.remove(profitable);
    }
  }
}
