package com.classrelationships.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Library {
  private List<Song> songs = new ArrayList<>();

  public void addSong(Song song) {
    songs.add(song);
  }

  public int getSongCount() {
    return songs.size();
  }

  public List<Song> getSongs() {
    return songs;
  }
}
