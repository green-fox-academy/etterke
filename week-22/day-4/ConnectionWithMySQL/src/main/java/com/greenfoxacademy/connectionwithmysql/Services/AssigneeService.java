package com.greenfoxacademy.connectionwithmysql.Services;

import com.greenfoxacademy.connectionwithmysql.Models.Assignee;
import com.greenfoxacademy.connectionwithmysql.Repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AssigneeService {

  @Autowired
  AssigneeRepository assigneeRepo;

  public ArrayList<Assignee> findAllAssignees() {
    ArrayList<Assignee> assignees = new ArrayList<>();
    assigneeRepo.findAll().forEach(assignees::add);
    return assignees;
  }

  public void saveNewAssignee(Assignee assignee){
    assigneeRepo.save(assignee);
  }

//  public void updateAssignee(Assignee assignee) {
//    assigneeRepo.save()
//  }

  public Assignee findById(long id) {
    Assignee assignee = assigneeRepo.findById(id).get();
    return assignee;
  }

  public void deleteAssignee(long id) {
    assigneeRepo.deleteById(id);
  }
}
