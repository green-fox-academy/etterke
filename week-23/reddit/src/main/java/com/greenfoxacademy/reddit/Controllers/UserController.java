package com.greenfoxacademy.reddit.Controllers;

import com.greenfoxacademy.reddit.Models.User;
import com.greenfoxacademy.reddit.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("/")
  public String renderMainPage() {
    return "main";
  }

  @GetMapping("/login")
  public String renderLoginForm() {
    return "login";
  }

  @PostMapping("/login")
  public String loginFoxForm(@RequestParam(name = "name") String name) {
    if(!userService.checkIfUserExistsByName(name)){
      return "register";
    } else {
      User user = userService.findByName(name);
      return "redirect:/trendingposts/" + user.getId();
    }
  }

  @GetMapping("/register")
  public String renderRegisterForm(Model model) {
    return "register";
  }

  @PostMapping("/register")
  public String registerFoxForm(@RequestParam(name = "name") String name, @ModelAttribute User user) {
    if(userService.checkIfUserExistsByName(name)) {
      return "login";
    } else {
      userService.saveUser(user);
      return "redirect:/trendingposts/" + user.getId();
    }
  }

}
