package com.greenfoxacademy.urlshortening.Controllers;

import com.greenfoxacademy.urlshortening.Models.Link;
import com.greenfoxacademy.urlshortening.Services.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.Http2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LinkController {

  @Autowired
  LinkService linkService;

  @GetMapping("/")
  public String renderMainPage(Model model){
    model.addAttribute("link", new Link());
    return "mainpage";
  }

  @PostMapping("/save-link")
  public String saveLinkPage(Model model,
                             @RequestParam(name = "alias") String alias,
                             @ModelAttribute Link link){
    if(linkService.exists(alias)){
      model.addAttribute("error", "Your alias is already in use!");
      return "mainpagewitherror";
    }
    link.setSecretCode(linkService.generateSecretCode());
    linkService.saveLink(link);
    return "mainpagewithsuccess";
  }

  @GetMapping("/a/{alias}")
  public String renderLink(@PathVariable String alias) {
    Link link = linkService.findLinkByAlias(alias);
    if(linkService.exists(alias)){
      linkService.incrementHitCount(alias);
      return "redirect:" + link.getUrl();
    }
    return "404";
  }
}
