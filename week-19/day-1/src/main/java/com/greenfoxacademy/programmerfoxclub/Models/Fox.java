package com.greenfoxacademy.programmerfoxclub.Models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private String image;
  private String food;
  private String drink;
  private List<String> tricksLearned;
  private List<Action> actionHistory;

  public Fox(String name, String image) {
    this.name = name;
    this.image = image;
    this.tricksLearned = new ArrayList<>();
    this.actionHistory = new ArrayList<>();
  }

  public int countTricksLearned(){
    return tricksLearned.size();
  }

  public int countActionHistory() {
    return actionHistory.size();
  }

  public String getName() {
    return name;
  }

  public String getImage() {
    return image;
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

  public List<Action> getActionHistory() {
    return actionHistory;
  }

}
