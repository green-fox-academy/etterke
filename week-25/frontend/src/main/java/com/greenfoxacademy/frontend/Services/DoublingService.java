package com.greenfoxacademy.frontend.Services;

import org.springframework.stereotype.Service;

@Service
public class DoublingService {

  public int doubleInput(int input){
    return input * 2;
  }
}
