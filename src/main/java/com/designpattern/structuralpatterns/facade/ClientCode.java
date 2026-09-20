package com.designpattern.structuralpatterns.facade;

public class ClientCode {
  public static void main(String[] args) {
    ICar car = new CarFacade();
    car.buildCar();
  }
}
