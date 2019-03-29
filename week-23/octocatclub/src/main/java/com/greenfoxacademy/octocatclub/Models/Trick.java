package com.greenfoxacademy.octocatclub.Models;

import javax.persistence.*;

@Entity
public class Trick {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long trickId;
  private String name;
  @ManyToOne
  private Octocat octocat;


  public Trick() {
  }

  public long getTrickId() {
    return trickId;
  }

  public void setTrickId(long trickId) {
    this.trickId = trickId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Octocat getOctocat() {
    return octocat;
  }

  public void setOctocat(Octocat octocat) {
    this.octocat = octocat;
  }
}
