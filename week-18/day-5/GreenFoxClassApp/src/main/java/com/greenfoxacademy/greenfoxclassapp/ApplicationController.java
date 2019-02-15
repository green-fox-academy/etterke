package com.greenfoxacademy.greenfoxclassapp;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApplicationController {
  @Autowired
  StudentService studentList;

  public ApplicationController(){
  }

  @GetMapping("/gfa")
  public String mainPage(){

    return "main";
  }

  @GetMapping("gfa/list")
  public String listOfStudents(Model model){
    model.addAttribute("studentList", studentList.findAll());
    return "studentlist";
  }

  @GetMapping("gfa/add")
  public String addStudentForm(){
    return "add";
  }

  @PostMapping("gfa/add")
  public String addStudent(@ModelAttribute String name){
    studentList.save(name);
    return "redirect:/gfa/list";
  }
}
