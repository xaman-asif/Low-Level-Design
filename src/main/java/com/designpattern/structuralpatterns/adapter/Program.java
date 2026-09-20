//https://logicalforhad.wordpress.com/2013/07/07/%E0%A6%8F%E0%A6%A1%E0%A6%BE%E0%A6%AA%E0%A7%8D%E0%A6%9F%E0%A6%BE%E0%A6%B0-%E0%A6%AA%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%9F%E0%A6%BE%E0%A6%B0%E0%A7%8D%E0%A6%A8-adapter-pattern/

package com.designpattern.structuralpatterns.adapter;

import java.util.List;

public class Program {
  public static void main(String[] args) {
//    var calculator = new Calculator();
//    int[] numbers = {1, 2, 3, 4, 5};
//    var sum = calculator.getSum(numbers);
//    System.out.println(sum);

    CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
    List<Integer> numbers = List.of(1, 2, 3, 4, 5);
    var sum = calculatorAdapter.getTotalSum(numbers);
    System.out.println(sum);
  }
}
