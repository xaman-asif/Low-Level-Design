package com.designpattern.structuralpatterns.bridge;

public class Win32RoundRobin implements RoundRobin {
  @Override
  public void applyAlgorithm() {
    System.out.println("Round Robin Thread Scheduling using Windows 32 API");
  }
}
