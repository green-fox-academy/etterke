package com.greenfoxacademy.frontend.Controllers;

import com.greenfoxacademy.frontend.Models.AppendA;
import com.greenfoxacademy.frontend.Models.Doubling;
import com.greenfoxacademy.frontend.Models.Error;
import com.greenfoxacademy.frontend.Models.Greeter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
  public Object renderGreeterPage(@RequestParam(required = false, value = "name") String name,
                                  @RequestParam(required = false, value = "title") String title) {

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
  public ResponseEntity<?> renderAppendAPage(@PathVariable(required = false) String appendable) {

    if(appendable == null){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error("404"));
    }
    return ResponseEntity.status(HttpStatus.OK).body(new AppendA("kuty"));
  }
}
