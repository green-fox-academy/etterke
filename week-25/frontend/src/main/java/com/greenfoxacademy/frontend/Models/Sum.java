package com.greenfoxacademy.frontend.Models;

public class Sum {

  private int result;

  public Sum(int until) {
    this.result = sumAction(until);
  }

  public int sumAction(int until){
    int number = 0;

    for (int i = 0; i <= until; i++) {
      number += i;
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
