package com.greenfoxacademy.urlshortening.Services;

import com.greenfoxacademy.urlshortening.Models.Link;
import com.greenfoxacademy.urlshortening.Repositories.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class LinkService {

  @Autowired
  LinkRepository linkRepository;

  public boolean exists(String alias) {
    return linkRepository.existsByAlias(alias);
  }

  public void saveLink(Link link) {
    linkRepository.save(link);
  }

  public void deleteLink(Link link) {
    linkRepository.delete(link);
  }

  public Link findLinkByAlias(String alias) {
    return linkRepository.findLinkByAlias(alias);
  }

  public Link findLinkById(long id) {
    return linkRepository.findLinkByLinkId(id);
  }

  public int generateSecretCode() {
    return 1000 + new Random().nextInt(9000);
  }

  public void incrementHitCount(String alias) {
    Link link = findLinkByAlias(alias);
    link.incrementHitCount();
    saveLink(link);
  }

  public ArrayList<Link> listAllLinks() {
    ArrayList<Link> links = new ArrayList<>();
    linkRepository.findAll().forEach(links::add);
    return links;
  }
}
