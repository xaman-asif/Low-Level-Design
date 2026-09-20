package com.designpattern.structuralpatterns.adapter;

import java.util.List;

public class CalculatorAdapter {
  private final Calculator _calculator;

  public CalculatorAdapter() {
    _calculator = new Calculator();
  }

  public int getTotalSum(List<Integer> numbers) {
    int sum = _calculator.getSum(numbers.stream().mapToInt(Integer::intValue).toArray());
    return sum;
  }
}
