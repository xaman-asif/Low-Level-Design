package com.oopfundamentals.abstraction;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract class Logger {
  protected String level;

  public Logger(String level) {
    this.level = level;
  }

  abstract void log(String message);

  String formatMessage(String message) {
    String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    return "[" + timeStamp + "] [" + level + "] " + message;
  }
}
