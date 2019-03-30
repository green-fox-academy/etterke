package com.greenfoxacademy.octocatclub.Repositories;

import com.greenfoxacademy.octocatclub.Models.Octocat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OctocatRepository extends CrudRepository<Octocat, Long> {

  boolean existsByNameEquals(String name);

  Octocat findOctocatByName(String name);

  Octocat findOctocatByOctocatId(long id);

}
