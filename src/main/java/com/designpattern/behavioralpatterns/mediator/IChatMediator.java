package com.designpattern.behavioralpatterns.mediator;

public interface IChatMediator {
  void sendMessage(String message, User user);

  void addPerson(User user);
}
