package com.greenfoxacademy.octocatclub.Models;

import java.util.ArrayList;
import java.util.List;

public class Food {

  private List<String> foods;

  public Food(List<String> foods) {
    this.foods = new ArrayList<>();
  }

  public List<String> getFoods() {
    return foods;
  }

  public void setFoods(List<String> foods) {
    this.foods = foods;
  }
}
