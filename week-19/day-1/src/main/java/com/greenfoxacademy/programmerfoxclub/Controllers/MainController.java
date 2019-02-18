package com.greenfoxacademy.programmerfoxclub.Controllers;

import com.greenfoxacademy.programmerfoxclub.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  Fox myFox;

  @GetMapping("/main")
  public String showMainPage(Model model, @RequestParam (name="name") String name) {
    model.addAttribute("name", name);
    return "index";
  }

  @GetMapping("/login")
  public String showLoginForm() {
    return "login";
  }

  @PostMapping("/login")
  public String loginForm(Model model, @RequestParam (name="name") String name) {
    model.addAttribute("name", name);
    return "redirect:/main/?name=" + name;
  }
}
