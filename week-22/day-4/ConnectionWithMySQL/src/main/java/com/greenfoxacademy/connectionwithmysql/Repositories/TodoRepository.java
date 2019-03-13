package com.greenfoxacademy.connectionwithmysql.Repositories;

import com.greenfoxacademy.connectionwithmysql.Models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface TodoRepository extends CrudRepository<Todo, Long> {

}