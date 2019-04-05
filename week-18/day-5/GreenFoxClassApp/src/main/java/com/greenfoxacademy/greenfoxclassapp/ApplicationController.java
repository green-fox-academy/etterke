package com.greenfoxacademy.greenfoxclassapp;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ApplicationController {
  @Autowired
  StudentService studentList;

  public ApplicationController(){
  }

  @GetMapping("/gfa")
  public String mainPage(Model model){
    model.addAttribute("studentCount", studentList.count());
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

  @GetMapping("gfa/save")
  public String addStudent(@RequestParam String name){
    studentList.save(name);
    return "redirect:/gfa/list";
  }

  @GetMapping("gfa/check")
  public String checkStudentForm(Model model, @ModelAttribute(name="name") String name){

    if (! name.equals("")) {
      model.addAttribute("checkName", studentList.check(name));
    } else {
      model.addAttribute("error", "Please type a name!");
    }
    return "check";
  }

}
