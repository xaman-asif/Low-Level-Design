package com.designpattern.behavioralpatterns.observer.example2;

import java.util.List;

public interface Observable {
  void subscribe(Subscriber subscriber);

  void unsubscribe(Subscriber subscriber);

  void notifySubscribers(List<Subscriber> subscribers);

}
