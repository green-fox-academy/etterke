package com.greenfoxacademy.reddit.Services;

import com.greenfoxacademy.reddit.Models.Post;
import com.greenfoxacademy.reddit.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

  @Autowired
  PostRepository postRepository;


  public List<Post> findAllPosts(){
    List<Post> posts = new ArrayList<>();
    postRepository.findAll().forEach(posts::add);
    return posts;
  }

  public Post findPostById(long id) {
    return postRepository.findById(id).get();
  }

  public void savePost(Post post) {
    postRepository.save(post);
  }

  public void upVotePost(long id) {
    Post post = findPostById(id);
    if(post != null){
      post.setScore(post.getScore() + 1);
    }
    savePost(post);
  }

  public void downVotePost(long id) {
    Post post = findPostById(id);
    if(post != null){
      post.setScore(post.getScore() - 1);
    }
    savePost(post);
  }
}
