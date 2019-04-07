package com.greenfoxacademy.urlshortening.Models;

import java.util.List;

public class LinkEntries {

  private List<Link> links;

  public LinkEntries(List<Link> links) {
    this.links = links;
  }

  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }
}
