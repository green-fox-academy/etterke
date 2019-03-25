package com.greenfoxacademy.reddit.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

  @GetMapping("/")
  public String renderMainPage() {
    return "main";
  }

  @GetMapping("/login")
  public String renderLoginForm() {
    return "login";
  }

  @PostMapping("/login")
  public String loginFoxForm(Model model, @RequestParam(name="name") String name) {

    return "redirect:/mainpage/?name=" + name;
  }

  @GetMapping("/register")
  public String renderRegisterForm(Model model) {
    return "register";
  }

  @PostMapping("/register")
  public String registerFoxForm(Model model, @RequestParam (name="name") String name) {

    return "redirect:/mainpage/?name=" + name;
  }

}
