package com.designpattern.behaviouralpatterns.iterator;

public class Program {
  public static void main(String[] args) {
//    System.out.println("Facebook Users");
//
//    ISocialNetworking iterator = new FacebookIterator();
//
//    while (iterator.hasNext()) {
//      System.out.println(iterator.next());
//    }
//
//    iterator = new TwitterIterator();
//    System.out.println("\nTwitter Users");
//
//    while (iterator.hasNext()) {
//      System.out.println(iterator.next());
//    }

    ISocialNetworking iterator;

    Facebook facebook = new Facebook();
    Twitter twitter = new Twitter();

    iterator = facebook.getIterator();
    System.out.println("Facebook Users");
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    iterator = twitter.getIterator();
    System.out.println("\nTwitter Users");
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
