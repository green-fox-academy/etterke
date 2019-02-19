package com.greenfoxacademy.programmerfoxclub.Controllers;

import com.greenfoxacademy.programmerfoxclub.Models.Nutrition;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FoxController {

  Nutrition nutrition = new Nutrition();

  @GetMapping("/nutritionstore")
  public String showNutritionStoreForm(Model model){
    nutrition.getFoods().add("pizza");
    nutrition.getFoods().add("salad");
    nutrition.getFoods().add("hummus");
    nutrition.getFoods().add("cheese");
    nutrition.getFoods().add("ramen");
    nutrition.getFoods().add("sushi");

    nutrition.getDrinks().add("lemonade");
    nutrition.getDrinks().add("cola");
    nutrition.getDrinks().add("water");
    nutrition.getDrinks().add("wine");
    nutrition.getDrinks().add("coffee");
    nutrition.getDrinks().add("tea");

    model.addAttribute("foods", nutrition.getFoods());
    model.addAttribute("drinks", nutrition.getDrinks());

    return "nutritionstore";
  }

  @PostMapping("/nutritionstore")
  public String nutritionStore(Nutrition nutrition){
    nutrition.add(nutrition);
    return "rediredt:/information";
  }

}
