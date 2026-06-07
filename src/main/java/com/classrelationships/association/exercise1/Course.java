package com.classrelationships.association.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Course {
  private final String title;
  private final List<Student> students = new ArrayList<>();
  private Instructor instructor;

  public Course(String title) {
    this.title = title;
  }

  public void enrollStudent(Student student) {
    // TODO: Add student to list and set this as the student's enrolled course
    if (!students.contains(student)) {
      students.add(student);
      student.setEnrolledCourse(this);
    }
  }

  public String getTitle() {
    return title;
  }

  public Instructor getInstructor() {
    return instructor;
  }

  public void setInstructor(Instructor instructor) {
    // TODO: Set the instructor reference
    this.instructor = instructor;
  }

  public List<Student> getStudents() {
    return students;
  }
}