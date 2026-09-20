package com.designpattern.structuralpatterns.bridge;

public class Win32ShortestJobFirst implements ShortestJobFirst {
  @Override
  public void applyAlgorithm() {
    System.out.println("Shortest Job First Thread Scheduling using windows 32 API");
  }
}
