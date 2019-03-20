package com.greenfoxacademy.connectionwithmysql.Services;

import com.greenfoxacademy.connectionwithmysql.Models.Todo;
import com.greenfoxacademy.connectionwithmysql.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService {

  @Autowired
  TodoRepository todoRep;

  public ArrayList<Todo> findAllTodos() {
    ArrayList<Todo> todos = new ArrayList<>();
    todoRep.findAll().forEach(todos::add);
    return todos;
  }

  public ArrayList<Todo> findUndoneTodos(){
    ArrayList<Todo> todos = findAllTodos();
    ArrayList<Todo> undoneTodos = new ArrayList<>();

    for (Todo todo : todos) {
      if (!todo.isDone()) {
        undoneTodos.add(todo);
      }
    }
    return undoneTodos;
  }

  public void saveNewTodo(Todo todo){
    todoRep.save(todo);
  }

  public void deleteTodo(long id) {
    todoRep.deleteById(id);
  }

  public Todo findById(long id) {
    Todo todo = todoRep.findById(id).get();
    return todo;
  }

  public ArrayList<Todo> findByTitle(String title) {
    ArrayList<Todo> todos = todoRep.findByTitleContaining(title);
    return todos;
  }
}
