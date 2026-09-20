package com.designpattern.structuralpatterns.facade;

public class CarFacade implements ICar {
  private final Body _body;
  private final Engine _engine;
  private final Seats _seats;
  private final Wheels _wheels;

  public CarFacade() {
    _body = new Body();
    _engine = new Engine();
    _seats = new Seats();
    _wheels = new Wheels();
  }

  public void buildCar() {
    System.out.println("Started making a car...");

    Body body = new Body();
    body.addBody(BodyType.Suv);

    Engine engine = new Engine();
    engine.addEngine(4);

    Seats seats = new Seats();
    seats.addSeats(4);

    Wheels wheels = new Wheels();
    wheels.addWheels(4);

    System.out.println("Ended making a car...");
  }
}
