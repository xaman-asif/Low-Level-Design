package com.designpattern.creationalpatterns.factory.factorypattern;

public class Photo implements Media {
  @Override
  public String getType() {
    return "Photo";
  }
}
