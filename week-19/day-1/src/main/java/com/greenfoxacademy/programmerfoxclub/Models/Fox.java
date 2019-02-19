package com.greenfoxacademy.programmerfoxclub.Models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private List<String> tricks;

  public Fox(String name) {
    this.name = name;
    this.tricks = new ArrayList<>();
  }

  public int countTricks(){
    return tricks.size();
  }

  public String getName() {
    return name;
  }

  public List<String> getTricks() {
    return tricks;
  }

}
