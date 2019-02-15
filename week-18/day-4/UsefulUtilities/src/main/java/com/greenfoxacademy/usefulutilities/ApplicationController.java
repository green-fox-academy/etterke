package com.greenfoxacademy.usefulutilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ApplicationController {

  @Autowired
  private UtilityService first;

  public ApplicationController() {
  }

  @GetMapping("/useful")
  public String homePage() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String randomColorPage(Model model) {
    model.addAttribute("color", first.randomColor());
    return "colored";
  }

  @GetMapping("useful/email")
  public String requestEmail(Model model, @RequestParam(name = "email", required = false) String email) {
    if (email != null) {
      model.addAttribute("checkEmailValidity", first.validateEmail(email));
      model.addAttribute("email", email);
    } else {
      model.addAttribute("error", "Please give an email address!");
    }
    return "email";
  }

  @GetMapping("useful/{text}/{number}/encoding")
  public String encodeText(Model model, @PathVariable(value="text") String text, @PathVariable(value="number") int number){
    if (text != null && number != 0){
      model.addAttribute("encode", first.caesar(text, number));
      model.addAttribute("text", text);
    } else {
      model.addAttribute("error", "Please give a text and a number!");
    }
    return "encoding";
  }

  @GetMapping("useful/{text}/{number}/decoding")
  public String decodeText(Model model, @PathVariable(value="text") String text, @PathVariable(value="number") int number){
    if (text != null && number != 0){
      model.addAttribute("decode", first.caesar(text, number));
      model.addAttribute("text", text);
    } else {
      model.addAttribute("error", "Please give a text and a number!");
    }
    return "decoding";
  }
}
