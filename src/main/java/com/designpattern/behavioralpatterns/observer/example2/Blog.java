package com.designpattern.behavioralpatterns.observer.example2;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Observable {
  private final List<Subscriber> subscribers;
  private String postTitle;

  public Blog() {
    subscribers = new ArrayList<>();
  }

  public Blog setPostTitle(String postTitle) {
    if (this.postTitle != postTitle) {
      this.postTitle = postTitle;
      notifySubscribers(subscribers);
    }
    return this;
  }

  public void subscribe(Subscriber subscriber) {
    subscribers.add(subscriber);
  }

  public void unsubscribe(Subscriber subscriber) {
    subscribers.remove(subscriber);
  }

  public void notifySubscribers(List<Subscriber> subscribers) {
    for (Subscriber subscriber : subscribers) {
      subscriber.getNotification(postTitle);
    }
  }
}
