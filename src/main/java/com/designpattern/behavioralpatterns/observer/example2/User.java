package com.designpattern.behavioralpatterns.observer.example2;

public class User implements Subscriber {
  public String name;

  public User(String name) {
    this.name = name;
  }

  @Override
  public void getNotification(String postTitle) {
    System.out.printf("Hey {0} Checkout the new post named {1}%n", name, postTitle);
  }

  @Override
  public String setName(String name) {
    return this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }
}
