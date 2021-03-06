package com.greenfoxacademy.octocatclub.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NutritionService {

  private List<String> foods;
  private List<String> drinks;

  public NutritionService() {
    this.foods = new ArrayList<>();
    foods.add("hummus");
    foods.add("pizza");
    foods.add("chicken tikka massala");
    foods.add("salad");
    this.drinks = new ArrayList<>();
    drinks.add("tea");
    drinks.add("coke");
    drinks.add("mango lassi");
    drinks.add("water");
  }

  public List<String> getFoods() {
    return foods;
  }

  public void setFoods(List<String> foods) {
    this.foods = foods;
  }

  public List<String> getDrinks() {
    return drinks;
  }

  public void setDrinks(List<String> drinks) {
    this.drinks = drinks;
  }
}

