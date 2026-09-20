package com.designpattern.behaviouralpatterns.chainofresponsibility;

public class Teamleader implements Approver {

  private Approver nextApprover;

  @Override
  public void setNextApprover(Approver nextApprover) {
    this.nextApprover = nextApprover;
  }

  @Override
  public Response approve(Employee employee) {
    if (employee.days == 1) {
      return Response.Approved;
    }
    return nextApprover.approve(employee);
  }
}
