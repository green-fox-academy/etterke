package com.greenfoxacademy.octocatclub.Controllers;

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
public class TrickController {

  @Autowired
  TrickService trickService;
  @Autowired
  OctocatService octocatService;

  @GetMapping("/information/{id}/trickcenter")
  public String renderTrickCenter(Model model,
                                  @PathVariable long id) {
    List<Trick> tricks = trickService.findAllTricks();
    model.addAttribute("octocat", octocatService.findOctocatById(id));
    model.addAttribute("tricks", tricks);
    return "trickcenter";
  }
}
