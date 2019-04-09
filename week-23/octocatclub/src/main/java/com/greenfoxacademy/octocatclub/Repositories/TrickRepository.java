package com.greenfoxacademy.octocatclub.Repositories;

import com.greenfoxacademy.octocatclub.Models.Trick;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TrickRepository extends CrudRepository<Trick, Long> {

  ArrayList findAllByOctocatOctocatId (long id);

  boolean existsTrickByName (String name);

  Trick findTrickByName (String name);
}
