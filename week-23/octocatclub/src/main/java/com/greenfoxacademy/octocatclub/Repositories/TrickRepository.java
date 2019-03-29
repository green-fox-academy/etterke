package com.greenfoxacademy.octocatclub.Repositories;

import com.greenfoxacademy.octocatclub.Models.Trick;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrickRepository extends CrudRepository<Trick, Long> {
}
