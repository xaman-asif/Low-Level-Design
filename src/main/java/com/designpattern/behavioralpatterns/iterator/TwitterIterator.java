package com.designpattern.behavioralpatterns.iterator;

public class TwitterIterator implements ISocialNetworking {
  private final int MAX_USER = 6;
  private final String[] userList;
  private int position = 0;

  public TwitterIterator() {
    userList = new String[MAX_USER];

    userList[0] = "_iLogical";
    userList[1] = "Amit Seal Ami";
    userList[2] = "Crackbrained Sakkhor";
    userList[3] = "Bazlur Rahman Rokon";
    userList[4] = "Sachine Tendulkar";
    userList[5] = "Shane Watson";
  }

  @Override
  public boolean hasNext() {
    return userList.length > position;
  }

  @Override
  public Object next() {
    String element = userList[position++];

    return element;
  }
}
