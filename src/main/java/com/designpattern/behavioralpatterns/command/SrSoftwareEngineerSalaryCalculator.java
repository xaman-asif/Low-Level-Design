package com.designpattern.behavioralpatterns.command;

public class SrSoftwareEngineerSalaryCalculator implements ISalaryCalculator {
  public double calculateSrSoftwareEngineer(double baseSalary) {
    return baseSalary * 2;
  }

  @Override
  public double calculateSalary(double baseSalary) {
    return calculateSrSoftwareEngineer(baseSalary);
  }
}
