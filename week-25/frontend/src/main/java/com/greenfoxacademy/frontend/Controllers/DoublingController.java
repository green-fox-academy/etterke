package com.greenfoxacademy.frontend.Controllers;

import com.greenfoxacademy.frontend.Models.Doubling;
import com.greenfoxacademy.frontend.Models.Error;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

  @RequestMapping("/doubling")
  public Object renderDoublingPage(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return new Error("Please provide an input!");
    } else {
      return new Doubling(input);
    }
  }
}
