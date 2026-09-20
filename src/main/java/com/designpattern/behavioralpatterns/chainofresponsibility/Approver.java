package com.designpattern.behavioralpatterns.chainofresponsibility;

public interface Approver {
  Response approve(Employee employee);

  void setNextApprover(Approver nextApprover);
}

