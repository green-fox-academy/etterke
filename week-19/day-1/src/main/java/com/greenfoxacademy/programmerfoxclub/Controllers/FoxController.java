package com.greenfoxacademy.programmerfoxclub.Controllers;

import com.greenfoxacademy.programmerfoxclub.Services.FoxService;
import com.greenfoxacademy.programmerfoxclub.Services.NutritionService;
import com.greenfoxacademy.programmerfoxclub.Services.TrickService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

  @Autowired
  NutritionService nutrition;
  @Autowired
  FoxService foxes;
  @Autowired
  TrickService tricks;


  @GetMapping("/nutritionstore")
  public String renderNutritionStoreForm(Model model, @RequestParam (name="name") String name){
    model.addAttribute("fox", foxes.findFoxByName(name));
    model.addAttribute("foods", nutrition.getFoods());
    model.addAttribute("drinks", nutrition.getDrinks());
    return "nutritionstore";
  }

  @PostMapping("/nutritionstore")
  public String nutritionStore(@RequestParam(name="name") String name,
                               @ModelAttribute(name = "food") String food,
                               @ModelAttribute(name = "drink") String drink){
    foxes.feedTheFox(name, food, drink);
    return "redirect:/information/?name=" + name;
  }

  @GetMapping("/trickcenter")
  public String renderTrickCenter(Model model, @RequestParam (name="name") String name){
    model.addAttribute("fox", foxes.findFoxByName(name));
    model.addAttribute("tricks", tricks.getTricks());
    return "trickcenter";
  }

  @PostMapping("/trickcenter")
  public String trickCenter(@RequestParam(name="name") String name,
                            @ModelAttribute(name = "trick") String trick){
    foxes.teachTheFox(name, trick);
    return "redirect:/information/?name=" + name;
  }

  @GetMapping("/actionhistory")
  public String renderActionHistory(Model model, @RequestParam (name="name") String name){
    model.addAttribute("fox", foxes.findFoxByName(name));
    return "actionhistory";
  }

}
