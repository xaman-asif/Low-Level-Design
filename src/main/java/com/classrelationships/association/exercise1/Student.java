package com.classrelationships.association.exercise1;

public class Student {
  private final String name;
  private Course enrolledCourse;

  public Student(String name) {
    this.name = name;
  }

  public String getInstructorName() {
    // TODO: Navigate through enrolledCourse to get the instructor's name
    // Return "No instructor" if course or instructor is null
    if (this.enrolledCourse == null || this.enrolledCourse.getInstructor() == null) {
      return "No instructor";
    }
    return this.enrolledCourse.getInstructor().getName();
  }

  public String getName() {
    return name;
  }

  public Course getEnrolledCourse() {
    return enrolledCourse;
  }

  public void setEnrolledCourse(Course course) {
    // TODO: Set the enrolled course reference
    this.enrolledCourse = course;
  }
}
