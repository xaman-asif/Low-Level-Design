package com.designpattern.behavioralpatterns.observer.example1;

public class Program {

  public static void main(String[] args) {
    NewsAgency observable = new NewsAgency();
    NewsChannel observer = new NewsChannel();

    observable.addObserver(observer);
    observable.setNews("news");

    System.out.println(observer.getNews().equals("news"));
  }
}
