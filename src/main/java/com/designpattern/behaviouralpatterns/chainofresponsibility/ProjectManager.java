package com.designpattern.behaviouralpatterns.chainofresponsibility;

public class ProjectManager implements Approver {
  private Approver nextApprover;

  @Override

  public Response approve(Employee employee) {
    if (employee.days <= 3 && employee.days >= 1) {
      return Response.Approved;
    }
    return nextApprover.approve(employee);
  }

  @Override
  public void setNextApprover(Approver nextApprover) {
    this.nextApprover = nextApprover;
  }

}
