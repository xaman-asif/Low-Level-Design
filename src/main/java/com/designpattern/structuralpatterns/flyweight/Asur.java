package com.designpattern.structuralpatterns.flyweight;

public class Asur implements ISoldier {
  public static int objectCount = 0;
  public int healthStatus;

  public Asur(int healthStatus) {
    this.healthStatus = healthStatus;
    objectCount++;
  }

  public static int getObjectCount() {
    return objectCount;
  }

  public static void setObjectCount(int objectCount) {
    Asur.objectCount = objectCount;
  }

  @Override
  public void move(int x1, int y1, int x2, int y2) {
    System.out.printf("Asur soldier is moving from (%d, %d) to (%d, %d)", x1, y1, x2, y2);
  }

  public int getHealthStatus() {
    return healthStatus;
  }

  public Asur setHealthStatus(int healthStatus) {
    this.healthStatus = healthStatus;
    return this;
  }
}
