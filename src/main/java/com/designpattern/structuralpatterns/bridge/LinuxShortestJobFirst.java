package com.designpattern.structuralpatterns.bridge;

public class LinuxShortestJobFirst implements ShortestJobFirst {

  @Override
  public void applyAlgorithm() {
    System.out.println("Shortest Job First Thread Scheduling using Linux Kernel API");
  }
}
