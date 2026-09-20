package com.designpattern.behavioralpatterns.iterator;

import java.util.List;

public class Facebook {
  private List<String> userList;

  public Facebook() {
//    userList = new ArrayList<>();
//
//    userList.add("Logical Forhad");
//    userList.add("Rayhanur Rahman");
//    userList.add("Maruf Khan");
//    userList.add("Arif Raian");
//    userList.add("Mahedi Mahfuj");
//    userList.add("Atish Dipankar");
  }

  public List<String> getUserList() {
    return userList;
  }

  public ISocialNetworking getIterator() {
    return new FacebookIterator();
  }
}
