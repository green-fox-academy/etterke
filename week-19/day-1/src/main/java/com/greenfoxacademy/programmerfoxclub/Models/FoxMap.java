package com.greenfoxacademy.programmerfoxclub.Models;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FoxMap {

  private HashMap<String, Fox> foxes;

  public FoxMap() {
    this.foxes = new HashMap<>();
  }

  public void addFox(String name, Fox fox){
    foxes.put(name, fox);
  }

  public Fox findFoxByName(String name) {
    Fox fox = foxes.get(name);
    return fox;
  }

  public void loginAFox(Fox fox, String name) {
    if (foxes.containsKey(name)) {
      findFoxByName(name);
    } else {
      addFox(name, fox);
    }
  }

  public HashMap<String, Fox> getFoxes() {
    return foxes;
  }

  public void setFoxes(HashMap<String, Fox> foxes) {
    this.foxes = foxes;
  }

}
