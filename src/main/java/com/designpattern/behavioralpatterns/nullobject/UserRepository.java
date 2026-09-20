package com.designpattern.behavioralpatterns.nullobject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
  private static List populateUserList() {
    List userList = new ArrayList();

    userList.add(new User("Zodu", "bit0215"));

    return userList;
  }

  public static IUser getUserRoleByName(String name) {
    List<User> userList = populateUserList();

    Optional<User> user = userList.stream().filter(u -> u.getName().equals(name)).findFirst();

    if (user == null) {
      return new NullUser();
    }

    return user.orElse(null);
  }
}
