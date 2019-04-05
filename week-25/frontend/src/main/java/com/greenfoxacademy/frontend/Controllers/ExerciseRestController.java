package com.greenfoxacademy.frontend.Controllers;

import com.greenfoxacademy.frontend.Models.*;
import com.greenfoxacademy.frontend.Models.Error;
import com.greenfoxacademy.frontend.Services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExerciseRestController {

  @Autowired
  RestService restService;

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

  @PostMapping("/arrays")
  public ResponseEntity<Object> renderArraysPage(@RequestBody(required = false) Arrays arrays){

    if(arrays != null){
      if(arrays.getWhat().equals("addUp")){
        Result result  = new Result(restService.addUp(arrays.getNumbers()));
        return ResponseEntity.status(HttpStatus.OK).body(result);
      } else if(arrays.getWhat().equals("multiply")){
        Result result = new Result(restService.multiply(arrays.getNumbers()));
        return ResponseEntity.status(HttpStatus.OK).body(result);
      } else if(arrays.getWhat().equals("doubleNumbers")){
        ArrayResult arrayResult = new ArrayResult(restService.doubleNumbers(arrays.getNumbers()));
        return ResponseEntity.status(HttpStatus.OK).body(arrayResult);
      }
    }
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error("Please provide what to do with the numbers!"));
  }

  @PostMapping("/sith")
  public ResponseEntity<Object> renderSithTextReversePage(@RequestBody(required = false) Sith sith){
    if(sith != null){
      SithReverse sithReverse = new SithReverse(restService.reverseSith(sith.getText()));
      return ResponseEntity.status(HttpStatus.OK).body(sithReverse);
    }
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error("Feed me some text you have to, padawan young you are. Hmmm."));
  }
}
