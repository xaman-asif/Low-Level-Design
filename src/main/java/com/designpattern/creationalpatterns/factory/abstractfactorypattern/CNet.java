package com.designpattern.creationalpatterns.factory.abstractfactorypattern;

public class CNet extends AbstractCourse {

  public CNet() {
    name = "Online CNet";
    duration = 2.00;
  }

  @Override
  public void createCourseMaterial() {
    System.out.println("Creating Online Course Material for CNet");
  }

  @Override
  public void createCourseSchedule() {
    System.out.println("Creating Online Course Schedule for CNet");
  }

  @Override
  public void displayCourseDetails() {
    System.out.println("Course Name: " + name + " Duration: " + duration + " hour");
  }
}
