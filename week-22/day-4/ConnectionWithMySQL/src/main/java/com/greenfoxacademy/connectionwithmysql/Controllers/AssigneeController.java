package com.greenfoxacademy.connectionwithmysql.Controllers;

import com.greenfoxacademy.connectionwithmysql.Repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysql.Services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

  @Autowired
  AssigneeRepository assigneeRep;
  @Autowired
  AssigneeService assigneeService;

  @GetMapping()
  public String renderAssigneeMainPage() {
    return "assigneemain";
  }

  @GetMapping("/list")
  public String renderAssigneeList() {
    return "assigneelist";
  }
}
