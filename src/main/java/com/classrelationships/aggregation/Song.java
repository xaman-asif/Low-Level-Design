package com.classrelationships.aggregation;

public class Song {
  private String title;
  private Artist artist;
  private int duration;

  public Song(String title, Artist artist, int duration) {
    this.title = title;
    this.artist = artist;
    this.duration = duration;
  }

  public String getTitle() {
    return title;
  }

  public Artist getArtist() {
    return artist;
  }

  public int getDuration() {
    return duration;
  }

  @Override
  public String toString() {
    return "Song{" + "title='" + title + '\'' + ", artist=" + artist + ", duration=" + duration + '}';
  }
}
