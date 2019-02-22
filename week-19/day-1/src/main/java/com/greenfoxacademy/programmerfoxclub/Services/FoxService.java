package com.greenfoxacademy.programmerfoxclub.Services;

import com.greenfoxacademy.programmerfoxclub.Models.Fox;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FoxService {

  private HashMap<String, Fox> foxes;

  public FoxService() {
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

  public void feedTheFox(String name, String food, String drink){
    Fox fox = findFoxByName(name);
    fox.setFood(food);
    fox.setDrink(drink);
  }

  public void teachTheFox(String name, String trick){
    Fox fox = findFoxByName(name);
    if(!fox.getTricksLearned().contains(trick)){
      fox.getTricksLearned().add(trick);
    }
  }

  public HashMap<String, Fox> getFoxes() {
    return foxes;
  }

  public void setFoxes(HashMap<String, Fox> foxes) {
    this.foxes = foxes;
  }

}
