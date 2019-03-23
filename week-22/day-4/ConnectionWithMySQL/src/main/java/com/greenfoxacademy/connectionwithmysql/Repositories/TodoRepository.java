package com.greenfoxacademy.connectionwithmysql.Repositories;

import com.greenfoxacademy.connectionwithmysql.Models.Assignee;
import com.greenfoxacademy.connectionwithmysql.Models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  ArrayList<Todo> findByTitleContaining(String title);
  ArrayList<Todo> findByAssignee(Assignee assignee);

}