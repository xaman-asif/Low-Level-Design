package com.designpattern.behaviouralpatterns.observer.pcl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLNewsChannel implements PropertyChangeListener {

  private String news;

  @Override
  public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
    this.setNews((String) propertyChangeEvent.getNewValue());
  }

  public String getNews() {
    return news;
  }

  public PCLNewsChannel setNews(String news) {
    this.news = news;
    return this;
  }
}
