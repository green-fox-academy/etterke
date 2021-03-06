package com.greenfoxacademy.urlshortening.Repositories;

import com.greenfoxacademy.urlshortening.Models.Link;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends CrudRepository<Link, Long> {

  boolean existsByAlias(String alias);

  Link findLinkByAlias(String alias);

  Link findLinkByLinkId(long id);

}
