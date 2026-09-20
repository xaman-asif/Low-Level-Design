package com.designpattern.structuralpatterns.facade;

public class Body {
  public Body() {

  }

  public void addBody(BodyType bodyType) {
    System.out.println(bodyType.name() + " Body Added");
  }
}
