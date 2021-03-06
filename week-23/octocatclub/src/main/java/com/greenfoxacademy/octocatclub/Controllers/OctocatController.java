package com.greenfoxacademy.octocatclub.Controllers;

import com.greenfoxacademy.octocatclub.Models.ImageList;
import com.greenfoxacademy.octocatclub.Models.Octocat;
import com.greenfoxacademy.octocatclub.Services.OctocatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OctocatController {

  @Autowired
  OctocatService octocatService;

  @GetMapping("/")
  public String redirectToMainPage(){
    return "redirect:/mainpage";
  }

  @GetMapping("/mainpage")
  public String renderMainPage(){
    return "mainpage";
  }

  @GetMapping("/register")
  public String renderRegistrationForm(Model model,
                                       @ModelAttribute Octocat octocat,
                                       @ModelAttribute ImageList imageList){
    model.addAttribute("octocat", octocat);
    model.addAttribute("images", imageList.getImages());
    return "registration";
  }

  @PostMapping("/register")
  public String RegistrationForm(Model model,
                                 @ModelAttribute Octocat octocat,
                                 @ModelAttribute ImageList imageList){
    if(octocatService.checkIfOctocatExistsByName(octocat.getName())){
      octocat = octocatService.findOctocatByName(octocat.getName());
      model.addAttribute("isRegistered", "You are already registered, please choose Log In");
      model.addAttribute("octocat", octocat);
      model.addAttribute("images", imageList.getImages());
      return "registration";
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
      model.addAttribute("notYetRegistered", "Please register first!");
      return "login";
    } else {
      Octocat octocat = octocatService.findOctocatByName(name);
      return "redirect:/information/" + octocat.getOctocatId();
    }
  }
}
