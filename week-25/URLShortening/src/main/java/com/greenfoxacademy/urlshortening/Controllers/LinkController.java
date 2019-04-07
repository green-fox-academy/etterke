package com.greenfoxacademy.urlshortening.Controllers;

import com.greenfoxacademy.urlshortening.Models.Link;
import com.greenfoxacademy.urlshortening.Services.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LinkController {

  @Autowired
  LinkService linkService;

  @GetMapping("/")
  public String renderMainPage(){
    return "mainpage";
  }

  @PostMapping("/save-link")
  public String saveLinkPage(Model model,
                             @RequestParam(name = "alias") String alias,
                             @ModelAttribute Link link){
    if(linkService.exists(alias)){
      model.addAttribute("message", "Your alias is already in use!");
      return "redirect:/";
    }
    linkService.saveLink(link);
    model.addAttribute("message", "Your URL is aliased to x ad your secret code is");
    return "redirect:/";
  }
}
