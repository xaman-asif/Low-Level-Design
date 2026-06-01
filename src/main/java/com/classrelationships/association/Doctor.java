package com.classrelationships.association;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Doctor {
  private String name;
  private String specialization;
  private List<Appointment> appointments = new ArrayList<>();

  public Doctor(String name, String specialization) {
    this.name = name;
    this.specialization = specialization;
  }

  public void addAppointment(Appointment appointment) {
    appointments.add(appointment);
  }

  public List<Patient> getPatients() {
    return appointments.stream().map(Appointment::getPatient).distinct().collect(Collectors.toList());
  }

  public String getName() {
    return name;
  }

  public String getSpecialization() {
    return specialization;
  }

  public List<Appointment> getAppointments() {
    return appointments;
  }
}
