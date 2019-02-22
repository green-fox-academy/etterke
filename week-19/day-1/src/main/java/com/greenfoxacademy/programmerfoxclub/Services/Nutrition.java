package com.greenfoxacademy.programmerfoxclub.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Nutrition {

  private List<String> foods;
  private List<String> drinks;

  public Nutrition() {
    this.foods = new ArrayList<>(Arrays.asList("pizza", "salad", "hummus", "cheese", "ramen", "sushi"));
    this.drinks = new ArrayList<>(Arrays.asList("lemonade", "cola", "water", "wine", "coffee", "tea"));
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
