package com.greenfoxacademy.programmerfoxclub.Controllers;

import com.greenfoxacademy.programmerfoxclub.Models.Fox;
import com.greenfoxacademy.programmerfoxclub.Services.FoxService;
import com.greenfoxacademy.programmerfoxclub.Services.ImageService;
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
  @Autowired
  ImageService images;

  @GetMapping("/main")
  public String renderMainPage() {
    return "main";
  }

  @GetMapping("/login")
  public String renderLoginForm() {
    return "login";
  }

  @PostMapping("/login")
  public String loginFoxForm(Model model, @RequestParam (name="name") String name) {
    if(!foxes.checkIfFoxExists(name)) {
      model.addAttribute("error", "This fox has not been registered yet. Please go back to the main page and register first.");
      return "login";
    } else {
      foxes.findFoxByName(name);
    }
    return "redirect:/information/?name=" + name;
  }

  @GetMapping("/register")
  public String renderRegisterForm(Model model) {
    model.addAttribute("images", images.getImages());
    return "register";
  }

  @PostMapping("/register")
  public String registerFoxForm(Model model, @RequestParam (name="name") String name, @RequestParam (name="image") String image) {
    if(foxes.checkIfFoxExists(name)){
      model.addAttribute("error", "This fox has already been registered. Please go back to the main page and log in.");
      model.addAttribute("images", images.getImages());
      return "register";
    } else {
      Fox fox = new Fox(name, image);
      foxes.registerAFox(fox, name);
    }
    return "redirect:/information/?name=" + name;
  }

  @GetMapping("/information")
  public String renderInformationPage(Model model, @RequestParam (name="name") String name) {
    Fox fox = foxes.findFoxByName(name);
    model.addAttribute("fox", fox);
    return "information";
  }

}
