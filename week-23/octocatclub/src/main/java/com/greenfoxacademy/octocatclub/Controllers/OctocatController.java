package com.greenfoxacademy.octocatclub.Controllers;

import com.greenfoxacademy.octocatclub.Models.Octocat;
import com.greenfoxacademy.octocatclub.Services.ImageService;
import com.greenfoxacademy.octocatclub.Services.OctocatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class OctocatController {

  @Autowired
  OctocatService octocatService;
  @Autowired
  ImageService imageService;

  @GetMapping("/")
  public String redirectToMainPage(){
    return "redirect:/mainpage";
  }

  @GetMapping("/mainpage")
  public String renderMainPage(){
    return "mainpage";
  }

  @GetMapping("/register")
  public String renderRegistrationForm(Model model){
    Octocat octocat = new Octocat();
    ArrayList<String> images = imageService.getImages();
    model.addAttribute("octocat", octocat);
    model.addAttribute("images", images);
    return "registration";
  }

  @PostMapping("/register")
  public String RegistrationForm(@RequestParam (name = "name") String name,
                                 @ModelAttribute Octocat octocat){
    if(octocatService.checkIfOctocatExistsByName(name)){
      return "redirect:/login";
    } else {
      octocatService.saveOctocat(octocat);
      return "redirect:/information/" + octocat.getOctocatId();
    }
  }

  @GetMapping("/login")
  public String renderLoginForm() {
    return "login";
  }

  @PostMapping("/login")
  public String loginForm(@RequestParam(name = "name") String name,
                          Model model) {

    if(!octocatService.checkIfOctocatExistsByName(name)){
      return "redirect:/register";
    } else {
      Octocat octocat = octocatService.findOctocatByName(name);
      return "redirect:/information/" + octocat.getOctocatId();
    }
  }
}
