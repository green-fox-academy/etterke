package com.greenfoxacademy.octocatclub.Controllers;

import com.greenfoxacademy.octocatclub.Services.OctocatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class InformationController {

  @Autowired
  OctocatService octocatService;

  @GetMapping("/information/{id}")
  public String renderInformationPage(Model model, @PathVariable long id){
    model.addAttribute("octocat", octocatService.findOctocatById(id));
    return "information";
  }
}
