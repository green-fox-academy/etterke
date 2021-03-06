package com.greenfoxacademy.greenfoxclassapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
  ArrayList<String> names;

  public StudentService() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }

  public List<String> findAll() {
    return names;
  }

  public void save(String student) {
    names.add(student);
  }

  public int count(){
    return names.size();
  }

  public String check(String name){
    String studentName = null;

    for (String student : names) {
      if (student.equalsIgnoreCase(name)) {
        studentName = student;
      }
    }
    return studentName;
  }
}
