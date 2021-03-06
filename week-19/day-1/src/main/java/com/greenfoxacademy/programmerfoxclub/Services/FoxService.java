package com.greenfoxacademy.programmerfoxclub.Services;

import com.greenfoxacademy.programmerfoxclub.Models.Action;
import com.greenfoxacademy.programmerfoxclub.Models.Fox;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDateTime;
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

  public boolean checkIfFoxExists(String name) {
    return foxes.containsKey(name);
  }

  public void registerAFox(Fox fox, String name) {
    addFox(name, fox);
  }

  public void feedTheFox(String name, String food, String drink){
    Fox fox = findFoxByName(name);
    fox.setFood(food);
    fox.setDrink(drink);

    LocalDateTime feedTime = LocalDateTime.now(Clock.systemUTC());
    String feedDescription = "Food has been changed to " + fox.getFood();

    Action feedAction = new Action(feedTime, feedDescription);
    fox.getActionHistory().add(feedAction);
  }

  public void teachTheFox(String name, String trick){
    Fox fox = findFoxByName(name);
    if(!fox.getTricksLearned().contains(trick)){
      fox.getTricksLearned().add(trick);
    }

    LocalDateTime teachingTime = LocalDateTime.now(Clock.systemUTC());
    String teachDescription = "Learned to " + fox.getTricksLearned();

    Action teachAction = new Action(teachingTime, teachDescription);
    fox.getActionHistory().add(teachAction);
  }

  public HashMap<String, Fox> getFoxes() {
    return foxes;
  }

  public void setFoxes(HashMap<String, Fox> foxes) {
    this.foxes = foxes;
  }

}
