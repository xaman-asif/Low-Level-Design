package com.designpattern.behavioralpatterns.memento;

public class Program {
  public static void main(String[] args) {
    Caretaker caretaker = new Caretaker();
    Originator originator = new Originator();

    originator.setState("State 1");
    caretaker.addMemento(originator.saveToMemento());

    originator.setState("State 2");
    caretaker.addMemento(originator.saveToMemento());

    originator.setState("State 3");
    caretaker.addMemento(originator.saveToMemento());

    originator.setState("State 4");
    caretaker.addMemento(originator.saveToMemento());

    originator.restoreFromMemento(caretaker.getMemento(2));
  }
}
