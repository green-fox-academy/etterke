package com.greenfoxacademy.reddit.Repositories;

import com.greenfoxacademy.reddit.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  User findUserByName(String name);

  boolean existsByNameEquals(String name);
}
