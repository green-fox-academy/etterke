package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  AtomicLong idCounter = new AtomicLong();

  @RequestMapping(value="/greeting")
  public Greeting greeting(@RequestParam("name") String name){
    Greeting greet = new Greeting(idCounter.incrementAndGet(), "Hello, " + name);
    return greet;
  }
}
