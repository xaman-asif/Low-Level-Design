package com.designpattern.behaviouralpatterns.command;

public class JrSoftwareEngineerSalaryCalculator implements ISalaryCalculator {
  public double calculateJrSoftwareEngineer(double baseSalary) {
    return baseSalary;
  }

  @Override
  public double calculateSalary(double baseSalary) {
    return calculateJrSoftwareEngineer(baseSalary);
  }
}
