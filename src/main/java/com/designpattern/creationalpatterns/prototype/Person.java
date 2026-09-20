package com.designpattern.creationalpatterns.prototype;

public class Person implements IClone {
  private String name;
  private String email;

  @Override
  public Object clone() {
    var person = new Person();
    person.name = name;
    person.email = email;
    return person;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
