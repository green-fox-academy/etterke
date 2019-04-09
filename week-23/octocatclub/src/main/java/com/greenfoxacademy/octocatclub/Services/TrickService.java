package com.greenfoxacademy.octocatclub.Services;

import com.greenfoxacademy.octocatclub.Models.Trick;
import com.greenfoxacademy.octocatclub.Repositories.TrickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrickService {

  @Autowired
  TrickRepository trickRepository;

  public List<Trick> findAllTricks() {
    List<Trick> tricks = new ArrayList<>();
    trickRepository.findAll().forEach(tricks::add);
    return tricks;
  }

  public void saveTrick(Trick trick) {
    trickRepository.save(trick);
  }

  public List<Trick> findByOctocatId(long id) {
    return trickRepository.findAllByOctocatOctocatId(id);
  }

  public Trick findByName(String name) {
    return trickRepository.findTrickByName(name);
  }

  public boolean doesTrickExists(String name) {
    return trickRepository.existsTrickByName(name);
  }
}
