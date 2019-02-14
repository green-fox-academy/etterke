package com.greenfoxacademy.coloringaround;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

  private MyColor newColor;

  public Printer(MyColor newColor){
    this.newColor = newColor;
  }

  public void log(String message) {
    System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
  }

  @Autowired
  public void logColor(){
    newColor.printColor();
  }
}
