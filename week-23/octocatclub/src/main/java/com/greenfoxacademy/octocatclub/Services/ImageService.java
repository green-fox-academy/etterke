package com.greenfoxacademy.octocatclub.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImageService {

  private List<String> images;

  public ImageService() {
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

  public List<String> getImages() {
    return images;
  }
}
