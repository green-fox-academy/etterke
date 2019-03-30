package com.greenfoxacademy.octocatclub.Controllers;

import com.greenfoxacademy.octocatclub.Models.Octocat;
import com.greenfoxacademy.octocatclub.Services.NutritionService;
import com.greenfoxacademy.octocatclub.Services.OctocatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NutritionController {

  @Autowired
  NutritionService nutritionService;
  @Autowired
  OctocatService octocatService;

  @GetMapping("/information/{id}/nutritioncenter")
  public String renderNutritionCenter(Model model,
                                      @PathVariable long id){
    model.addAttribute("octocat", octocatService.findOctocatById(id));
    model.addAttribute("foods", nutritionService.getFoods());
    model.addAttribute("drinks", nutritionService.getDrinks());
    return "nutritioncenter";

  }

  @PostMapping("/information/{id}/nutritioncenter")
  public String nutritionCenter(@PathVariable long id,
                                @RequestParam (name = "selectedFood") String food,
                                @RequestParam (name = "selectedDrink") String drink){
    Octocat octocat = octocatService.findOctocatById(id);
    octocat.setSelectedFood(food);
    octocat.setSelectedDrink(drink);
    octocatService.saveOctocat(octocat);
    return "redirect:/information/{id}";
  }
}
