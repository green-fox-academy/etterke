package com.greenfoxacademy.frontend.Models;

public class Fact {

  private int result;

  public Fact(int until) {
    this.result = factAction(until);
  }

  public int factAction(int until){
    int number = 1;

    for (int i = 1; i <= until ; i++) {
      number *= i;
    }
    return number;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
