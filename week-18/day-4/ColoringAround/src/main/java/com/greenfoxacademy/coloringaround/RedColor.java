package com.greenfoxacademy.coloringaround;

import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

  public RedColor(){
  }

  @Override
  public void printColor() {
    System.out.println("This color is red");
  }

}
