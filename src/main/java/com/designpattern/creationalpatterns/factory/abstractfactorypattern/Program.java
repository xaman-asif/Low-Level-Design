// https://logicalforhad.wordpress.com/2013/05/22/%E0%A6%AB%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%95%E0%A7%8D%E0%A6%9F%E0%A6%B0%E0%A6%BF-%E0%A6%AA%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%9F%E0%A6%BE%E0%A6%B0%E0%A7%8D%E0%A6%A8%E0%A7%87%E0%A6%B0-%E0%A6%AA%E0%A7%8B/

package com.designpattern.creationalpatterns.factory.abstractfactorypattern;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Program program = new Program();
    program.clientCode();
  }

  public void clientCode() {
    Scanner input = new Scanner(System.in);
    OfflineCourseFactory offlineCourseFactory = new OfflineCourseFactory();
    OnlineCourseFactory onlineCourseFactory = new OnlineCourseFactory();

    String courseName = input.nextLine();
    AbstractCourse abstractCourse = offlineCourseFactory.createCourse(courseName);

    courseName = input.nextLine();
    abstractCourse = onlineCourseFactory.createCourse(courseName);
  }
}
