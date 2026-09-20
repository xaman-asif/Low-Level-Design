package com.designpattern.behavioralpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ISocialNetworking {
  private final List<String> userList;
  private int position = 0;

  public FacebookIterator() {
    userList = new ArrayList<>();

    userList.add("Logical Forhad");
    userList.add("Rayhanur Rahman");
    userList.add("Maruf Khan");
    userList.add("Arif Raian");
    userList.add("Mahedi Mahfuj");
    userList.add("Atish Dipankar");
  }

  @Override
  public boolean hasNext() {
    return userList.size() > position;
  }

  @Override
  public Object next() {
    String element = userList.get(position++);

    return element;
  }
}
