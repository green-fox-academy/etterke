package com.greenfoxacademy.octocatclub.Models;

import java.util.ArrayList;
import java.util.List;

public class Drink {

  private List<String> drinks;

  public Drink(List<String> drinks) {
    this.drinks = new ArrayList<>();
  }

  public List<String> getDrinks() {
    return drinks;
  }

  public void setDrinks(List<String> drinks) {
    this.drinks = drinks;
  }
}
