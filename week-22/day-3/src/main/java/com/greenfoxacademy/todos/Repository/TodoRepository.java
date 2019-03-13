package com.greenfoxacademy.todos.Repository;

import com.greenfoxacademy.todos.Model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
