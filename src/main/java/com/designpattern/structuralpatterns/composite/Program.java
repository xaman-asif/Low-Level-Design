package com.designpattern.structuralpatterns.composite;

public class Program {
  public static void main(String[] args) {
    var store1 = new Store(1, "Malibagh BFC", 2);
    var store2 = new Store(2, "Gulshan BFC", 5);

    var city = new City(10, "Dhaka");

    city.addChild(store1);
    city.addChild(store2);

    var division = new Division(1, "Rajshahi");

    division.addChild(city);

    int totalProfit = division.getProfit();

    System.out.printf("Total Profit of %s city is %d", city.name, totalProfit);
  }
}
