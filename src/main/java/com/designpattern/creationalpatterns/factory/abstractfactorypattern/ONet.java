package com.designpattern.creationalpatterns.factory.abstractfactorypattern;

public class ONet extends AbstractCourse {

  public ONet() {
    name = "Online ONet";
    duration = 1.30;
  }

  @Override
  public void createCourseMaterial() {
    System.out.println("Creating Online Course Material for ONet");
  }

  @Override
  public void createCourseSchedule() {
    System.out.println("Creating Online Course Schedule for ONet");
  }

  @Override
  public void displayCourseDetails() {
    System.out.println("Course Name: " + name + " Duration: " + duration + " hour");
  }
}
