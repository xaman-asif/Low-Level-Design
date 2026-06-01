package com.classrelationships.association;

import java.util.ArrayList;
import java.util.List;

public class Patient {
  private String name;
  private List<Appointment> appointments = new ArrayList<>();

  public Patient(String name) {
    this.name = name;
  }

  public void addAppointments(Appointment appointment) {
    appointments.add(appointment);
  }

  public List<Doctor> getDoctors() {
    return appointments.stream().map(Appointment::getDoctor).distinct().toList();
  }

  public String getName() {
    return name;
  }

  public List<Appointment> getAppointments() {
    return appointments;
  }
}
