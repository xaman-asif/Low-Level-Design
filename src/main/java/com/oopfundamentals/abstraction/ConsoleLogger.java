package com.oopfundamentals.abstraction;

public class ConsoleLogger extends Logger{
  public ConsoleLogger(String level) {
    super(level);
  }

  @Override
  void log(String message) {
    System.out.println(formatMessage(message));
  }
}
