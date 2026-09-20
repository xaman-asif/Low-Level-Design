package com.designpattern.creationalpatterns.factory.abstractfactorypattern;

public abstract class AbstractCourse {
  protected String name;
  protected Double duration;

  public abstract void createCourseMaterial();

  public abstract void createCourseSchedule();

  public abstract void displayCourseDetails();
}
