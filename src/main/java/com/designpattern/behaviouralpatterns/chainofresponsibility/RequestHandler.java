package com.designpattern.behaviouralpatterns.chainofresponsibility;

public class RequestHandler implements Approver {

  private Approver nextApprover;

  @Override
  public Response approve(Employee employee) {
    return nextApprover.approve(employee);
  }

  @Override
  public void setNextApprover(Approver nextApprover) {
    this.nextApprover = nextApprover;
  }
}
