package com.greenfoxacademy.connectionwithmysql.Controllers;

import com.greenfoxacademy.connectionwithmysql.Models.Assignee;
import com.greenfoxacademy.connectionwithmysql.Repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysql.Services.AssigneeService;
import com.greenfoxacademy.connectionwithmysql.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

  @Autowired
  AssigneeRepository assigneeRep;
  @Autowired
  AssigneeService assigneeService;
  @Autowired
  TodoService todoService;

  @GetMapping("/list")
  public String renderAssigneeList(Model model) {
    ArrayList<Assignee> assignees = assigneeService.findAllAssignees();
    model.addAttribute("assignees", assignees);
    return "assigneelist";
  }

  @GetMapping("/add")
  public String renderAddAssigneeForm() {
    return "addassignee";
  }

  @PostMapping("/add")
  public String addNewAssignee(@ModelAttribute Assignee newAssignee) {
    assigneeService.saveNewAssignee(newAssignee);
    return "redirect:/assignee/list";
  }

  @PostMapping("/{id}/delete")
  public String deleteAssignee(@PathVariable long id) {
    assigneeService.deleteAssignee(id);
    return "redirect:/assignee/list";
  }

  @GetMapping("/{id}/edit")
  public String renderEditAssigneesForm(@PathVariable long id, Model model) {
    Assignee assignee = assigneeService.findById(id);
    model.addAttribute("assignee", assignee);
    return "editassignee";
  }

  @PostMapping("/{id}/edit")
  public String editAssignee(@PathVariable long id, @ModelAttribute (value = "name") String name) {
    Assignee assignee = assigneeService.findById(id);
    assignee.setName(name);
    assigneeService.saveNewAssignee(assignee);
    return "redirect:/assignee/list";
  }

  @GetMapping("/{id}/details")
  public String renderTodosByAssignee(@PathVariable long id, Model model) {
    Assignee assignee = assigneeService.findById(id);
    model.addAttribute("assignee", assignee);
    model.addAttribute("todos", todoService.findTodosByAssignee(assignee));
    return "assigneedetails";
  }
}
