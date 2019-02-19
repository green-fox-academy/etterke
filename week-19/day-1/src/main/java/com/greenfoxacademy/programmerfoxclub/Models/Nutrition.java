package com.greenfoxacademy.programmerfoxclub.Models;

import java.util.ArrayList;
import java.util.List;

public class Nutrition {

  private List<String> foods;
  private List<String> drinks;

  public Nutrition() {
    this.foods = new ArrayList<>();
    this.drinks = new ArrayList<>();
  }

  public void add(Nutrition nutrition){
    nutrition.add(nutrition);
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
