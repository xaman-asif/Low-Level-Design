package com.designpattern.behavioralpatterns.observer.example2;

public class Program {
  public static void main(String[] args) {
    Blog blog = new Blog();

    Subscriber user = new User("DemoUser");
    Subscriber moderator = new Moderator("Modu");

    blog.subscribe(user);
    blog.subscribe(moderator);

    blog.setPostTitle("Observer Patter");

    blog.unsubscribe(moderator);
    blog.setPostTitle("Singleton");
  }
}
