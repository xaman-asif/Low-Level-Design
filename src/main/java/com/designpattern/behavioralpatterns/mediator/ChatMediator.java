package com.designpattern.behavioralpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {
  private final List<User> personList;

  public ChatMediator() {
    personList = new ArrayList<>();
  }

  @Override
  public void sendMessage(String message, User user) {
    for (User u : personList) {
      if (u != user) {
        u.receive(message);
      }
    }
  }

  @Override
  public void addPerson(User user) {
    personList.add(user);
  }
}
