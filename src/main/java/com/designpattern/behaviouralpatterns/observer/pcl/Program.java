package com.designpattern.behaviouralpatterns.observer.pcl;

public class Program {
  public static void main(String[] args) {
    PCLNewsAgency observable = new PCLNewsAgency();
    PCLNewsChannel observer = new PCLNewsChannel();

    observable.addPropertyChangeListener(observer);
    observable.setNews("news");

    System.out.println(observer.getNews().equals("news"));
  }
}
