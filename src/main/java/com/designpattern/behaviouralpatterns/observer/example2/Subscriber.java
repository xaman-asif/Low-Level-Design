package com.designpattern.behaviouralpatterns.observer.example2;

public interface Subscriber {
  void getNotification(String postTitle);

  String setName(String name);

  String getName();
}
