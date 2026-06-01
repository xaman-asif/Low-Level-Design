package com.classrelationships.aggregation;

import java.util.ArrayList;
import java.util.List;

public class User {
  private String name;
  private List<Playlist> playlists = new ArrayList<>();

  public User(String name) {
    this.name = name;
  }

  public Playlist createPlaylist(String playlistName) {
    Playlist playlist = new Playlist(playlistName);
    playlists.add(playlist);
    return playlist;
  }

  public void deletePlaylist(Playlist playlist) {
    playlists.remove(playlist);
  }

  public String getName() {
    return name;
  }

  public List<Playlist> getPlaylists() {
    return playlists;
  }
}
