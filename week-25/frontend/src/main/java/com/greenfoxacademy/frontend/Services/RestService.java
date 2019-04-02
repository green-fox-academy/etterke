package com.greenfoxacademy.frontend.Services;

import org.springframework.stereotype.Service;

@Service
public class RestService {

  public int doubleInput(int input){
    return input * 2;
  }
}
