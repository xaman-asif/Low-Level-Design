package com.designpattern.behavioralpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
  private final List<Memento> savedStateList = new ArrayList<>();

  public void addMemento(Memento memento) {
    savedStateList.add(memento);
  }

  public Memento getMemento(int index) {
    return savedStateList.get(index);
  }
}
