package com.designpattern.creationalpatterns.factory.abstractfactorypattern;

public class CJava extends AbstractCourse {

  public CJava() {
    name = "Online CJava";
    duration = 1.45;
  }

  @Override
  public void createCourseMaterial() {
    System.out.println("Creating Online Course Material for CJava");
  }

  @Override
  public void createCourseSchedule() {
    System.out.println("Creating Online Course Schedule for CJava");
  }

  @Override
  public void displayCourseDetails() {
    System.out.println("Course Name: " + name + " Duration: " + duration + " hour");
  }
}
