package com.designpattern.creationalpatterns.prototype;

public class Program {
  public static void main(String[] args) {
    Person person = new Person();
    person.setName("Person");
    person.setEmail("xyz@gmail.com");

    System.out.println("Before Clone");
    System.out.println(person);

    Person person1 = (Person) person.clone();
    System.out.println("After Clone");
    System.out.println(person1);
  }
}
