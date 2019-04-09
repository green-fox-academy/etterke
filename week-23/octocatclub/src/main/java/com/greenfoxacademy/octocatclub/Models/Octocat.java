package com.greenfoxacademy.octocatclub.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Octocat {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long octocatId;
  private String name;
  private String selectedImage;
  private String selectedFood;
  private String selectedDrink;
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

  public String getSelectedImage() {
    return selectedImage;
  }

  public void setSelectedImage(String selectedImage) {
    this.selectedImage = selectedImage;
  }

  public String getSelectedFood() {
    return selectedFood;
  }

  public void setSelectedFood(String selectedFood) {
    this.selectedFood = selectedFood;
  }

  public String getSelectedDrink() {
    return selectedDrink;
  }

  public void setSelectedDrink(String selectedDrink) {
    this.selectedDrink = selectedDrink;
  }

  public List<Trick> getTricks() {
    return tricks;
  }

  public void setTricks(List<Trick> tricks) {
    this.tricks = tricks;
  }
}
