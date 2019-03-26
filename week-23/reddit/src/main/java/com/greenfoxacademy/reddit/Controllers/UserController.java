package com.greenfoxacademy.reddit.Controllers;

import com.greenfoxacademy.reddit.Models.User;
import com.greenfoxacademy.reddit.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("/mainlogin")
  public String renderMainPage() {
    return "mainlogin";
  }

  @GetMapping("/login")
  public String renderLoginForm() {
    return "login";
  }

  @PostMapping("/login")
  public String loginForm(@RequestParam(name = "name") String name) {
    if(!userService.checkIfUserExistsByName(name)){
      return "register";
    } else {
      User user = userService.findByName(name);
      return "redirect:/" + user.getId();
    }

  }

  @GetMapping("/register")
  public String renderRegisterUserForm() {
    return "register";
  }

  @PostMapping("/register")
  public String registerUserForm(@RequestParam(name = "name") String name, @ModelAttribute User user) {
    if(userService.checkIfUserExistsByName(name)) {
      return "login";
    } else {
      userService.saveUser(user);
      return "redirect:/" + user.getId();
    }
  }

}
