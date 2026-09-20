package com.designpattern.behavioralpatterns.command;

public class Program {
  public static void main(String[] args) {
    var salaryCalculator = new SalaryCalculator();

    salaryCalculator.addSalaryCalculator(new TraineeSalaryCalculator());
    salaryCalculator.calculateSalary();

    salaryCalculator.addSalaryCalculator(new JrSoftwareEngineerSalaryCalculator());
    salaryCalculator.calculateSalary();

    salaryCalculator.addSalaryCalculator(new SrSoftwareEngineerSalaryCalculator());
    salaryCalculator.calculateSalary();

    salaryCalculator.addSalaryCalculator(new ProjectManagerSalaryCalculator());
    salaryCalculator.calculateSalary();
  }
}
