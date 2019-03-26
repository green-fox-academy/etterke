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
@RequestMapping("/trendingposts")
public class PostController {

  @Autowired
  UserService userService;
  @Autowired
  PostService postService;

  @GetMapping()
  public String renderPostPage(Model model){
    List<Post> posts = postService.findAllPosts();
    model.addAttribute("posts", posts);
    return "trendingposts";
  }

  @GetMapping("/{id}")
  public String renderPostPageById(Model model, @PathVariable(value = "id") long id){
    User user = userService.findById(id);
    model.addAttribute("user", user);
    return "trendingposts";
  }

  @GetMapping("/addpost")
  public String renderAddPostPage(){
    return "addpost";
  }

  @PostMapping("/addpost")
  public String addPostPage(@ModelAttribute Post post){
    postService.savePost(post);
    return "redirect:/trendingposts";
  }

  @PostMapping("/upvote/{id}")
  public String upVotePost(@PathVariable long id){
    postService.upVotePost(id);
    return "redirect:/trendingposts";
  }

  @PostMapping("/downvote/{id}")
  public String downVotePost(@PathVariable long id){
    postService.downVotePost(id);
    return "redirect:/trendingposts";
  }

}
