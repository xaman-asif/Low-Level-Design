package com.designpattern.behaviouralpatterns.iterator;

public class Twitter {
  private final int MAX_USER = 6;
  private String[] userList;

  public Twitter() {
//    userList = new String[MAX_USER];
//
//    userList[0] = "_iLogical";
//    userList[1] = "Amit Seal Ami";
//    userList[2] = "Crackbrained Sakkhor";
//    userList[3] = "Bazlur Rahman Rokon";
//    userList[4] = "Sachine Tendulkar";
//    userList[5] = "Shane Watson";
  }

  public String[] getUserList() {
    return userList;
  }

  public ISocialNetworking getIterator() {
    return new TwitterIterator();
  }
}
