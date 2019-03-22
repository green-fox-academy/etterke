package com.greenfoxacademy.connectionwithmysql.Controllers;

import com.greenfoxacademy.connectionwithmysql.Models.Todo;
import com.greenfoxacademy.connectionwithmysql.Repositories.TodoRepository;
import com.greenfoxacademy.connectionwithmysql.Services.AssigneeService;
import com.greenfoxacademy.connectionwithmysql.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRep;
  @Autowired
  TodoService todoService;
  @Autowired
  AssigneeService assigneeService;

  @GetMapping("/")
  public String list() {
    return "redirect:/todo/list";
  }

  @GetMapping("/list")
  public String listWithActiveTodos(Model model, @RequestParam(required = false) boolean isActive) {
    ArrayList<Todo> todos;
    if (isActive){
      todos = todoService.findUndoneTodos();
    } else {
      todos = todoService.findAllTodos();
    }
    model.addAttribute("todos", todos);
    model.addAttribute("assignees",assigneeService.findAllAssignees());

    return "todolist";
  }

  @PostMapping("/list")
  public String showTitleSearchResult(Model model, @ModelAttribute (value = "title") String title) {
    ArrayList<Todo> todos = todoService.findByTitle(title);
    model.addAttribute("todos", todos);
    return "todolist";
  }

  @GetMapping("/add")
  public String renderAddTodosForm() {
    return "addtodo";
  }

  @PostMapping("/add")
  public String addNewTodo(@ModelAttribute Todo newTodo) {
    todoService.saveNewTodo(newTodo);
    return "redirect:/todo/list";
  }

  @PostMapping("/{id}/delete")
  public String deleteTodo(@PathVariable Long id) {
    todoService.deleteTodo(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String renderEditTodosForm(@PathVariable Long id, Model model) {
    Todo todo = todoService.findById(id);
    model.addAttribute("todo", todo);
    model.addAttribute("assignees",assigneeService.findAllAssignees());
    return "edittodo";
  }

  @PostMapping("/{id}/edit")
  public String editTodo(@PathVariable Long id, @ModelAttribute Todo todo) {
    todoService.saveNewTodo(todo);
    return "redirect:/todo/list";
  }
}
