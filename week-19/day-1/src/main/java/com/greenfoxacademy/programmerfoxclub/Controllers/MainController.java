package com.greenfoxacademy.programmerfoxclub.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/main")
  public String showMainPage() {
    return "index";
  }

  @GetMapping("/login")
  public String showLoginForm() {
    return "login";
  }
}
