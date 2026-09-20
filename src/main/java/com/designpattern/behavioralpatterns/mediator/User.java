package com.designpattern.behavioralpatterns.mediator;

public abstract class User {
  protected IChatMediator IChatMediator;
  protected String name;
//  public String message;
//  protected final List<User> personList = new ArrayList<>();
//
//  public User(String name) {
//    this.name = name;
//  }
//
//  public void sendMessage(User user)
//  {
//    if (user != null) {
//      personList.add(user);
//    }
//
//    userChecking();
//  }
//
//  protected abstract void userChecking();
//
//  public User setMessage(String message) {
//    this.message = message;
//    return this;
//  }

  public User(IChatMediator IChatMediator, String name) {
    this.IChatMediator = IChatMediator;
    this.name = name;
  }

  public abstract void send(String message);

  public abstract void receive(String message);
}
