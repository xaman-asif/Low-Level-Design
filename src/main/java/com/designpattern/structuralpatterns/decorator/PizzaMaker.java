package com.designpattern.structuralpatterns.decorator;

public class PizzaMaker {
  public static void main(String[] args) {
    Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

    System.out.println("Ingridients: " + basicPizza.getDescription());
    System.out.println("Price: " + basicPizza.getCost());
  }
}
