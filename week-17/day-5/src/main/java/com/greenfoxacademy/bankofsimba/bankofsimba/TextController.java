package com.greenfoxacademy.bankofsimba.bankofsimba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TextController {

  @GetMapping("/text")
  @ResponseBody
  public String showText() {
    return "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
  }

  @GetMapping("/text2")
  public String showText3(Model model) {
    String textToShow = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", textToShow);
    return "text";
  }

}
