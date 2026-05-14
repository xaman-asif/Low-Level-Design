package com.oopfundamentals.abstraction;

public class LoggingService {
  void log(String destination, String message) {
    if (destination.equals("console")) {
      System.out.println("[LOG] " + message);
    } else if (destination.equals("file")) {
      // Open file, write message, close file
    } else if (destination.equals("remote")) {
      // Create HTTP connection, send payload, handle response
    }
  }
}
