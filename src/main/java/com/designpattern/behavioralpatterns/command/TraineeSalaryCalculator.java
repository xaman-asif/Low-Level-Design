package com.designpattern.behavioralpatterns.command;

public class TraineeSalaryCalculator implements ISalaryCalculator {
  public double calculateTraineeSalary(double baseSalary) {
    return baseSalary / 2;
  }

  @Override
  public double calculateSalary(double baseSalary) {
    return calculateTraineeSalary(baseSalary);
  }
}
