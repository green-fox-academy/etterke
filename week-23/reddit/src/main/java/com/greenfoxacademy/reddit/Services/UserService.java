package com.greenfoxacademy.reddit.Services;

import com.greenfoxacademy.reddit.Models.User;
import com.greenfoxacademy.reddit.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  public List<User> findAllUsers() {
    List<User> users = new ArrayList<>();
    userRepository.findAll().forEach(users::add);
    return users;
  }

  public void saveUser(User user) {
    userRepository.save(user);
  }

  public User findById(long id) {
    return userRepository.findById(id).get();
  }

  public User findByName(String name) {
    return userRepository.findUserByName(name);
  }

  public boolean checkIfUserExistsByName(String name) {
    return userRepository.existsByNameEquals(name);
  }
}
