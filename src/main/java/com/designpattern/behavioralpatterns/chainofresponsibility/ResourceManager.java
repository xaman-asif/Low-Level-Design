package com.designpattern.behavioralpatterns.chainofresponsibility;

public class ResourceManager implements Approver {

  private Approver nextApprover;

  @Override
  public Response approve(Employee employee) {
    if (employee.days >= 7) {
      return Response.Approved;
    }
    return nextApprover.approve(employee);
  }

  @Override
  public void setNextApprover(Approver nextApprover) {
    this.nextApprover = nextApprover;
  }
}
