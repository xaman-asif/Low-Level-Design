package com.designpattern.behaviouralpatterns.nullobject;

public class Program {
  public static void main(String[] args) {
    IUser user = UserRepository.getUserRoleByName("Modu");

    String roll = user.getUserRoll();

    System.out.println(roll);
  }
}
