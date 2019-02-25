package com.greenfoxacademy.programmerfoxclub.Controllers;

import com.greenfoxacademy.programmerfoxclub.Models.Fox;
import com.greenfoxacademy.programmerfoxclub.Services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  FoxService foxes;

  @GetMapping("/main")
  public String showMainPage() {
    return "main";
  }

  @GetMapping("/login")
  public String showLoginForm() {
    return "login";
  }

  @PostMapping("/login")
  public String loginFoxForm(@RequestParam (name="name") String name) {
    foxes.findFoxByName(name);
    return "redirect:/information/?name=" + name;
  }

  @GetMapping("/register")
  public String showRegisterForm() {
    return "register";
  }

  @PostMapping("/register")
  public String registerFoxForm(Fox fox, @RequestParam (name="name") String name) {
    foxes.loginAFox(fox, name);
    return "redirect:/information/?name=" + name;
  }

  @GetMapping("/information")
  public String showInformationPage(Model model, @RequestParam (name="name") String name) {
    Fox fox = foxes.findFoxByName(name);
    model.addAttribute("fox", fox);
    return "information";
  }

}
