package com.designpattern.behavioralpatterns.chainofresponsibility;

//https://logicalforhad.wordpress.com/2013/05/26/%E0%A6%9A%E0%A7%87%E0%A6%87%E0%A6%A8-%E0%A6%85%E0%A6%AB-%E0%A6%B0%E0%A7%87%E0%A6%A8%E0%A7%8D%E0%A6%B8%E0%A6%AA%E0%A6%A8%E0%A7%8D%E0%A6%B8%E0%A6%BF%E0%A6%AC%E0%A6%BF%E0%A6%B2%E0%A6%BF%E0%A6%9F%E0%A6%BF/
public class Program {
  private static Approver createChain() {
    Approver handler = new RequestHandler();

    Approver approver1 = new Teamleader();
    Approver approver2 = new ProjectManager();
    Approver approver3 = new ResourceManager();

    handler.setNextApprover(approver1);
    approver1.setNextApprover(approver2);
    approver2.setNextApprover(approver3);

    return handler;
  }

  public static void main(String[] args) {
    Employee employee = new Employee("Forhad", 7);

    Approver approver = createChain();

    Response response = approver.approve(employee);

    if (response == Response.Approved) {
      System.out.println("Approved");
    } else if (response == Response.Denied) {
      System.out.println("Denied");
    }
  }
}
