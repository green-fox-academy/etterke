package com.greenfoxacademy.octocatclub.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Octocat {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long octocatId;
  private String name;
  private String imageURL;
  private String food;
  private String drink;
  @OneToMany
  @JoinColumn(name = "octocat_id")
  private List<Trick> tricks;

  public Octocat() {
  }

  public long getOctocatId() {
    return octocatId;
  }

  public void setOctocatId(long octocatId) {
    this.octocatId = octocatId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
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

  public List<Trick> getTricks() {
    return tricks;
  }

  public void setTricks(List<Trick> tricks) {
    this.tricks = tricks;
  }
}
