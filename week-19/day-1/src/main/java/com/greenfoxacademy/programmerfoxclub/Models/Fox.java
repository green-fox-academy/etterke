package com.greenfoxacademy.programmerfoxclub.Models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private String food;
  private String drink;
  private List<String> tricksLearned;

  public Fox(String name) {
    this.name = name;
    this.tricksLearned = new ArrayList<>();
  }

  public int countTricksLearned(){
    return tricksLearned.size();
  }

  public String getName() {
    return name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<String> getTricksLearned() {
    return tricksLearned;
  }

}
