package com.greenfoxacademy.octocatclub.Models;

import java.util.ArrayList;

public class ImageList {

  private ArrayList<String> images;

  public ImageList() {
    this.images = new ArrayList<>();
    images.add("/images/github_HP.png");
    images.add("/images/github_minion.png");
    images.add("/images/github_momtocat.png");
    images.add("/images/github_rainbowpony.png");
    images.add("/images/github_wet.png");
    images.add("/images/github_stormtroopocat.png");
    images.add("/images/github_drink.png");
    images.add("/images/murakamicat.png");
  }

  public ArrayList<String> getImages() {
    return images;
  }

  public void setImages(ArrayList<String> images) {
    this.images = images;
  }
}
