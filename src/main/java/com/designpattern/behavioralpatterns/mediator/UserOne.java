package com.designpattern.behavioralpatterns.mediator;

public class UserOne extends User {
  public UserOne(IChatMediator IChatMediator, String name) {
    super(IChatMediator, name);
  }

  @Override
  public void send(String message) {
    System.out.println(name + " :Sending Message=" + message);
    IChatMediator.sendMessage(message, this);
  }

  @Override
  public void receive(String message) {
    System.out.println(name + " :Received Message:" + message);
  }
}
