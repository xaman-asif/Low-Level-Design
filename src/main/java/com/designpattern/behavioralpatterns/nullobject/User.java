package com.designpattern.behavioralpatterns.nullobject;

public class User implements IUser {
  public String name;
  public String roll;

  public User(String name, String roll) {
    this.name = name;
    this.roll = roll;
  }

  public String getName() {
    return name;
  }

  public User setName(String name) {
    this.name = name;
    return this;
  }

  public String getRoll() {
    return roll;
  }

  public User setRoll(String roll) {
    this.roll = roll;
    return this;
  }

  @Override
  public String getUserRoll() {
    return roll;
  }
}
