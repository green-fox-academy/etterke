package com.greenfoxacademy.todos;

import com.greenfoxacademy.todos.Model.Todo;
import com.greenfoxacademy.todos.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosApplication implements CommandLineRunner {

  @Autowired
  TodoRepository todoRep;

  public static void main(String[] args) {
    SpringApplication.run(TodosApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRep.save(new Todo("Feed the children"));
    todoRep.save(new Todo("Get some rest"));
    todoRep.save(new Todo("Say whaaaaat?"));
    todoRep.save(new Todo("Assemble IKEA cabinets"));
  }
}
