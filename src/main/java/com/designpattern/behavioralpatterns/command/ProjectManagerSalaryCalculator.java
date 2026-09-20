package com.designpattern.behavioralpatterns.command;

public class ProjectManagerSalaryCalculator implements ISalaryCalculator {
  public double calculateProjectManagerSalary(double baseSalary) {
    return baseSalary * 3;
  }

  @Override
  public double calculateSalary(double baseSalary) {
    return calculateProjectManagerSalary(baseSalary);
  }
}
