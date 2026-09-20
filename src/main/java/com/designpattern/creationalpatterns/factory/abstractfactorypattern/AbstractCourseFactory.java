package com.designpattern.creationalpatterns.factory.abstractfactorypattern;

public abstract class AbstractCourseFactory {
  protected AbstractCourse createCourse(String courseName) {
    AbstractCourse abstractCourse = getCourse(courseName);
    abstractCourse.createCourseMaterial();
    abstractCourse.createCourseSchedule();
    abstractCourse.displayCourseDetails();
    return abstractCourse;
  }

  protected abstract AbstractCourse getCourse(String courseName);
}
