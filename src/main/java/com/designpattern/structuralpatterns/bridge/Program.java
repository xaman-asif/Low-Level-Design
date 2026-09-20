package com.designpattern.structuralpatterns.bridge;

public class Program {
  public static void main(String[] args) {
//    RoundRobin roundRobin = null;
//
//    roundRobin = new Win32RoundRobin();
//    roundRobin.applyAlgorithm();
//
//    roundRobin = new LinuxRoundRobin();
//    roundRobin.applyAlgorithm();
//
//    ShortestJobFirst shortestJobFirst = null;
//
//    shortestJobFirst = new LinuxShortestJobFirst();
//    shortestJobFirst.applyAlgorithm();
//
//    shortestJobFirst = new Win32ShortestJobFirst();
//    shortestJobFirst.applyAlgorithm();


    AbstractOsBridge abstractOsBridge = null;
    abstractOsBridge = new LinuxKernelApi(new LinuxRoundRobin());
    abstractOsBridge.executeAlgorithm();

    abstractOsBridge = new LinuxKernelApi(new LinuxShortestJobFirst());
    abstractOsBridge.executeAlgorithm();

    abstractOsBridge = new Win32Api(new Win32RoundRobin());
    abstractOsBridge.executeAlgorithm();

    abstractOsBridge = new Win32Api(new Win32ShortestJobFirst());
    abstractOsBridge.executeAlgorithm();
  }
}
