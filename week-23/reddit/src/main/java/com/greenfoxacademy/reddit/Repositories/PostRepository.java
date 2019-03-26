package com.greenfoxacademy.reddit.Repositories;

import com.greenfoxacademy.reddit.Models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  ArrayList<Post> findByUser_Id(long id);
}
