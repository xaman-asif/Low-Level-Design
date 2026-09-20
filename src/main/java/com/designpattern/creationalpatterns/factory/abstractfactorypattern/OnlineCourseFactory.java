package com.designpattern.creationalpatterns.factory.abstractfactorypattern;

public class OnlineCourseFactory extends AbstractCourseFactory {
  @Override
  protected AbstractCourse getCourse(String courseName) {
    AbstractCourse abstractCourse = null;

    if (courseName.equalsIgnoreCase("ONet")) {
      abstractCourse = new ONet();
    } else if (courseName.equalsIgnoreCase("OJava")) {
      abstractCourse = new OJava();
    }

    return abstractCourse;
  }
}
