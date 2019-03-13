package com.greenfoxacademy.todos.Controller;


import com.greenfoxacademy.todos.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    return "todolist";
  }
}


