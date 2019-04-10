package com.greenfoxacademy.octocatclub.Controllers;

import com.greenfoxacademy.octocatclub.Models.Octocat;
import com.greenfoxacademy.octocatclub.Models.Trick;
import com.greenfoxacademy.octocatclub.Services.OctocatService;
import com.greenfoxacademy.octocatclub.Services.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class InformationController {

  @Autowired
  OctocatService octocatService;
  @Autowired
  TrickService trickService;

  @GetMapping("/information/{id}")
  public String renderInformationPage(Model model,
                                      @PathVariable long id,
                                      @ModelAttribute Trick trick){
    Octocat octocat = octocatService.findOctocatById(id);
    List<Trick> tricks = trickService.findByOctocatId(id);
    model.addAttribute("octocat", octocat);
    model.addAttribute("numberOfTricks", tricks.size());
    model.addAttribute("tricks", tricks);
    return "information";
  }
}
