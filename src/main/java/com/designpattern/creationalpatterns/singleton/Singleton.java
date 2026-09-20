//Double Checked Lock Approach

package com.designpattern.creationalpatterns.singleton;

public class Singleton {
  private static final Object _lock = new Object();
  private volatile static Singleton uniqueInstance;

  private Singleton() {
  }

  public static Singleton createInstance() {
    if (uniqueInstance == null) {
      synchronized (_lock) {
        uniqueInstance = new Singleton();
      }
    }
    return uniqueInstance;
  }
}
