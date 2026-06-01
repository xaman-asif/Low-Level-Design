package com.classrelationships.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
  private String name;
  private List<Song> songs = new ArrayList<>();

  public Playlist(String name) {
    this.name = name;
  }

  public void addSong(Song song) {
    songs.add(song);
  }

  public void removeSong(Song song) {
    songs.remove(song);
  }

  public int getSongCount() {
    return songs.size();
  }

  public int getTotalDuration() {
    int total = 0;
    for (Song song : songs) {
      total += song.getDuration();
    }
    return total;
  }

  public String getName() {
    return name;
  }

  public List<Song> getSongs() {
    return songs;
  }
}
