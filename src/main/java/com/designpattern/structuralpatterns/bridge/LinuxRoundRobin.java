package com.designpattern.structuralpatterns.bridge;

public class LinuxRoundRobin implements RoundRobin {

  @Override
  public void applyAlgorithm() {
    System.out.println("Round Robin Thread Scheduling using Linux Kernel API");
  }
}
