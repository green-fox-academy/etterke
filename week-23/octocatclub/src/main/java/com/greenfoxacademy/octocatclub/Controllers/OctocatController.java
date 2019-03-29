package com.greenfoxacademy.octocatclub.Controllers;

import com.greenfoxacademy.octocatclub.Services.OctocatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

}
