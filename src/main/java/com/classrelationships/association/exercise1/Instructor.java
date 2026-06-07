package com.classrelationships.association.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
  private final String name;
  private final List<Course> courses = new ArrayList<>();

  public Instructor(String name) {
    this.name = name;
  }

  public void addCourse(Course course) {
    // TODO: Add course to list and set this as the course's instructor
    course.setInstructor(this);
    courses.add(course);
  }

  public String getName() {
    return name;
  }

  public List<Course> getCourses() {
    return courses;
  }
}