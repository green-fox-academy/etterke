package com.greenfoxacademy.urlshortening.Controllers;

import com.greenfoxacademy.urlshortening.Models.Link;
import com.greenfoxacademy.urlshortening.Models.LinkEntries;
import com.greenfoxacademy.urlshortening.Services.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RESTController {

  @Autowired
  LinkService linkService;

  @PostMapping("/api/links")
  public ResponseEntity<Object> listLinks() {
    List<Link> links = linkService.listAllLinks();

    if(links.size() == 0) {
      return ResponseEntity.status(404).body(new Error("The list is currently empty"));
    } else {
      return ResponseEntity.status(200).body(new LinkEntries(links));
    }
  }

  @DeleteMapping("/api/links/{id}")
  public ResponseEntity<?> deleteByIdAndSecretCode(@PathVariable long id,
                                                   @RequestBody int secretCode) {

  }
}
