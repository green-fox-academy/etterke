package com.greenfoxacademy.octocatclub.Services;

import com.greenfoxacademy.octocatclub.Models.Octocat;
import com.greenfoxacademy.octocatclub.Models.Trick;
import com.greenfoxacademy.octocatclub.Repositories.OctocatRepository;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OctocatService {

  @Autowired
  OctocatRepository octocatRepository;

  public void saveOctocat(Octocat octocat){
    octocatRepository.save(octocat);
  }

  public List<Octocat> findAllOctocats() {
    List<Octocat> octocats = new ArrayList<>();
    octocatRepository.findAll().forEach(octocats::add);
    return octocats;
  }

  public Octocat findOctocatByName(String name){
    return octocatRepository.findOctocatByName(name);
  }

  public Octocat findOctocatById(long id) {
    return octocatRepository.findOctocatByOctocatId(id);
  }

  public boolean checkIfOctocatExistsByName(String name){
    return octocatRepository.existsByNameEquals(name);
  }

}
