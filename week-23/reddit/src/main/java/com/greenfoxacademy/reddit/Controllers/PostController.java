package com.greenfoxacademy.reddit.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

  @GetMapping("/trendingposts")
  public String renderMainPage(){
    return "trendingposts";
  }


}
