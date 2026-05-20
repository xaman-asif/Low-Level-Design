package com.oopfundamentals.polymorphism;

import com.oopfundamentals.inheritance.PushNotification;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // All stored as Notification references, but each is a different actual type
    List<Notification> notifications = List.of(
        new EmailNotification("alice@example.com", "Your order shipped!", "Order Update"),
        new SMSNotification("Bob", "Code: 482910", "+1-555-0123")
    );

    // Polymorphic dispatch: each call routes to the correct override
    for (Notification n : notifications) {
      n.send();
    }
  }
}
