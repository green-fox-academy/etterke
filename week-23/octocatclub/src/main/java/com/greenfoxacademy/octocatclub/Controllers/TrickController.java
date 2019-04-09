package com.greenfoxacademy.octocatclub.Controllers;

import com.greenfoxacademy.octocatclub.Models.Trick;
import com.greenfoxacademy.octocatclub.Services.OctocatService;
import com.greenfoxacademy.octocatclub.Services.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    model.addAttribute("trick", new Trick());
    return "trickcenter";
  }

  @PostMapping("/information/{id}/trickcenter")
  public String trickCenter(Model model,
                            @PathVariable long id,
                            @ModelAttribute Trick trick) {
    if(trickService.doesTrickExists(trick.getName())) {
      trick = trickService.findByName(trick.getName());
      model.addAttribute("trickExists", "This trick already exists, think of something else!");
      model.addAttribute("trick", trick);
      model.addAttribute("octocat", octocatService.findOctocatById(id));
      List<Trick> tricks = trickService.findAllTricks();
      model.addAttribute("tricks", tricks);
      return "trickcenter";
    } else {
      trickService.saveTrick(trick);
      model.addAttribute("trickIsSaved", "Your trick is safe with us!");
      model.addAttribute("trick", new Trick());
      model.addAttribute("octocat", octocatService.findOctocatById(id));
      List<Trick> tricks = trickService.findAllTricks();
      model.addAttribute("tricks", tricks);
      return "trickcenter";
    }
  }
}
