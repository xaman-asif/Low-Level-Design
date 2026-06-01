package com.classrelationships.association;

public class Room {
  private String number;
  private int floor;

  public Room(String number, int floor) {
    this.number = number;
    this.floor = floor;
  }

  public String getNumber() {
    return number;
  }

  public int getFloor() {
    return floor;
  }
}
