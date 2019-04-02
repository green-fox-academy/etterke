package com.greenfoxacademy.frontend.Controllers;

import com.greenfoxacademy.frontend.Models.*;
import com.greenfoxacademy.frontend.Models.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExerciseRestController {

  @RequestMapping("/doubling")
  public Object renderDoublingPage(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return new Error("Please provide an input!");
    } else {
      return new Doubling(input);
    }
  }

  @RequestMapping("/greeter")
  public Object renderGreeterPage(@RequestParam(required = false) String name,
                                  @RequestParam(required = false) String title) {

    if ((name == null) && (title == null) ){
      return new Error("Please provide a name and a title");
    } else if (title == null) {
      return new Error("Please provide a title");
    } else if (name ==  null) {
      return new Error("Please provide a name");
    } else {
      return new Greeter("Oh, hi there " + name + ", " + "my dear " + title + "!");
    }
  }

  @RequestMapping("/appenda/{appendable}")
  public ResponseEntity<?> renderAppendAPage(@PathVariable String appendable) {

    if(appendable == null){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error("404"));
    }
    return ResponseEntity.status(HttpStatus.OK).body(new AppendA("kuty"));
  }

  @PostMapping("/dountil/{action}")
  public Object renderDoUntilPage(@PathVariable String action,
                                  @RequestBody(required = false) Until until){

    if(until != null){
      if (action.equals("sum")){
        return new Sum(until.getUntil());
      } else if (action.equals("factor")) {
        return new Fact(until.getUntil());
      } else {
        return new Error("404");
      }
    } else {
      return new Error("Please provide a number!");
    }
  }
}
