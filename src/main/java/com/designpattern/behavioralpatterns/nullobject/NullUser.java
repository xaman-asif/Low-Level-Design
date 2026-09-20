package com.designpattern.behavioralpatterns.nullobject;

public class NullUser implements IUser {
  @Override
  public String getUserRoll() {
    return "Sorry We could not find this user";
  }
}
