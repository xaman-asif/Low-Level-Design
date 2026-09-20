package com.designpattern.behaviouralpatterns.observer.example2;

public class Moderator implements Subscriber {
  public String name;

  public Moderator(String name) {
    this.name = name;
  }

  @Override
  public void getNotification(String postTitle) {
    System.out.printf(
        "Hello Mr:{0} A new post named {1} has been posted in the blognyou need to moderate the comments%n", name,
        postTitle);
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
