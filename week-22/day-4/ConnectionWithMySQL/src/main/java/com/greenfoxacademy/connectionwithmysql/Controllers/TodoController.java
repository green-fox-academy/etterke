package com.greenfoxacademy.connectionwithmysql.Controllers;

import com.greenfoxacademy.connectionwithmysql.Models.Todo;
import com.greenfoxacademy.connectionwithmysql.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRep;

  @GetMapping("/")
  @ResponseBody
  public String list() {
    return "This is my first Todo";
  }

  @GetMapping("/list")
  public String list(Model model) {
    ArrayList<Todo> todos = new ArrayList<>();
    todoRep.findAll().forEach(todos::add);
    model.addAttribute("todos", todos);
    return "todolist";
  }

}
