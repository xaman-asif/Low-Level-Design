package com.designpattern.behavioralpatterns.mediator;

public class Program {
  public static void main(String[] args) {
    IChatMediator chatMediator = new ChatMediator();

    User me = new UserOne(chatMediator, "Forhad");
    User person1 = new UserOne(chatMediator, "Shuvo");
    User person2 = new UserOne(chatMediator, "Shujon");
    User person3 = new UserOne(chatMediator, "Moin");

    chatMediator.addPerson(person1);
    chatMediator.addPerson(person2);
    chatMediator.addPerson(person3);

    me.send("Hi All, How are you?");
  }
}
