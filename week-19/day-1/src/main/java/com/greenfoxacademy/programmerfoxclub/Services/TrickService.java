package com.greenfoxacademy.programmerfoxclub.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TrickService {

  private List<String> tricks;

  public TrickService() {
    this.tricks = new ArrayList<>(Arrays.asList("plays the guitar", "does yoga", "front end developer", "dances with you", "plays boardgames", "tells you that you look good every day", "can cook"));
  }

  public List<String> getTricks() {
    return tricks;
  }

}
