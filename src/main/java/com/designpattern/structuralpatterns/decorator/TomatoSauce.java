package com.designpattern.structuralpatterns.decorator;

public class TomatoSauce extends ToppingDecorator {

  public TomatoSauce(Pizza newPizza) {
    super(newPizza);

    System.out.println("Adding Sauce");
    System.out.println("Adding Mozzarella");
  }

  public String getDescription() {
    return tempPizza.getDescription() + ", Tomato Sauce";
  }

  public double getCost() {
    return tempPizza.getCost() + .35;
  }
}
