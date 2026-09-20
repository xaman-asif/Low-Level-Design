package com.designpattern.structuralpatterns.adapter;

import java.util.Arrays;

public class Calculator {
  public int getSum(int[] numbers) {
    int sum = Arrays.stream(numbers).sum();
    return sum;
  }
}
