package com.designpattern.behavioralpatterns.memento;

public class Originator {
  private String state;

  public Memento saveToMemento() {
    System.out.println("Originator: Saving to Memento.");
    return (new Memento(state));
  }

  public void restoreFromMemento(Memento memento) {
    state = memento.state;
    System.out.println("Originator: State after restoring from Memento: " + state);
  }

  public String getState() {
    return state;
  }

  public Originator setState(String state) {
    this.state = state;
    return this;
  }
}
