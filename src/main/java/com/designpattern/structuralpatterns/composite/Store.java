package com.designpattern.structuralpatterns.composite;

public class Store implements Profitable {
  public int id;
  public String name;
  public int profit;

  public Store(int id, String name, int profit) {
    this.id = id;
    this.name = name;
    this.profit = profit;
  }

  public int getId() {
    return id;
  }

  public Store setId(int id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public Store setName(String name) {
    this.name = name;
    return this;
  }

  public int getProfit() {
    return profit;
  }

  public Store setProfit(int profit) {
    this.profit = profit;
    return this;
  }

  @Override
  public void addChild(Profitable profitable) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void removeChild(Profitable profitable) {
    throw new UnsupportedOperationException();
  }
}
