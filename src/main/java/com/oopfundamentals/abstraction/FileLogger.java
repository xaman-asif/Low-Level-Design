package com.oopfundamentals.abstraction;

public class FileLogger  extends Logger{
  private String filePath;

  public FileLogger(String level, String filePath) {
    super(level);
    this.filePath = filePath;
  }

  @Override
  void log(String message) {
    // In production, this would write to a file
    System.out.println("Writing to " + filePath + ": " + formatMessage(message));
  }
}
