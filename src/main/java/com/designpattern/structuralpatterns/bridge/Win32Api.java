package com.designpattern.structuralpatterns.bridge;

public class Win32Api extends AbstractOsBridge {
  public Win32Api(SchedulingAlgorithm schedulingAlgorithm) {
    super(schedulingAlgorithm);
  }

  @Override
  public void executeAlgorithm() {
    schedulingAlgorithm.applyAlgorithm();
    System.out.println("in Windows 32 Api...");
  }
}
