package com.greenfoxacademy.reddit.Controllers;

import com.greenfoxacademy.reddit.Models.Post;
import com.greenfoxacademy.reddit.Models.User;
import com.greenfoxacademy.reddit.Services.PostService;
import com.greenfoxacademy.reddit.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {

  @Autowired
  UserService userService;
  @Autowired
  PostService postService;

  @GetMapping("/")
  public String renderPostPage(Model model){
    List<Post> posts = postService.showPostsByDescOrder();
    model.addAttribute("posts", posts);
    return "trendingposts";
  }

  @GetMapping("/{id}")
  public String renderPostPageById(Model model,
                                   @PathVariable long id){
    User user = userService.findById(id);
    List<Post> posts = postService.showPostsByDescOrder();
    model.addAttribute("user", user);
    model.addAttribute("posts", posts);
    return "trendingpostsbyuserid";
  }

  @GetMapping("/{id}/addpost")
  public String renderAddPostPage(Model model,
                                  @PathVariable long id){
    User user = userService.findById(id);
    model.addAttribute("user", user);
    return "addpost";
  }

  @PostMapping("/{id}/addpost")
  public String addPostPage(@ModelAttribute Post post){
    postService.savePost(post);
    return "redirect:/{id}";
  }

  @PostMapping("/{id}/upvote/{postId}")
  public String upVotePost(Model model,
                           @PathVariable long postId){
    List<Post> posts = postService.showPostsByDescOrder();
    model.addAttribute("posts", posts);
    postService.upVotePost(postId);
    return "redirect:/{id}";
  }

  @PostMapping("/{id}/downvote/{postId}")
  public String downVotePost(Model model,
                             @PathVariable long postId){
    List<Post> posts = postService.showPostsByDescOrder();
    model.addAttribute("posts", posts);
    postService.downVotePost(postId);
    return "redirect:/{id}";
  }

  @PostMapping("/{id}/delete/{postId}")
  public String deletePost(@PathVariable long postId){
    postService.deletePost(postId);
    return "redirect:/{id}";
  }

  @GetMapping("/{id}/myposts")
  public String renderUserPosts(Model model,
                                @PathVariable(value = "id") long id){
    User user = userService.findById(id);
    List<Post> postsByUser = postService.findByUserId(id);
    model.addAttribute("user", user);
    model.addAttribute("posts", postsByUser);
    return "postsbyuser";
  }

}
