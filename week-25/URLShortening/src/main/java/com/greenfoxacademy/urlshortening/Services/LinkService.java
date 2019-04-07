package com.greenfoxacademy.urlshortening.Services;

import com.greenfoxacademy.urlshortening.Repositories.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkService {

  @Autowired
  LinkRepository linkRepository;
}
