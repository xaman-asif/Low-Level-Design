//Using Lock Approach

package com.designpattern.creationalpatterns.singleton;

public class Singleton2 {

  private static final Object _lock = new Object();
  private static Singleton2 uniqueInstance;

  private Singleton2() {
  }

  public static Singleton2 createInstance() {
    synchronized (_lock) {
      if (uniqueInstance == null) {
        return new Singleton2();
      }
    }

    return uniqueInstance;
  }
}
