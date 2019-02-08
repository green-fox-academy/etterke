package com.greenfoxacademy.bankofsimba.bankofsimba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {

  BankAccount firstAccount = new BankAccount("Simba", 300, "lion");

  @RequestMapping(path = "/show")
  public String showAccount(Model model) {
    model.addAttribute("name", firstAccount.getName());
    model.addAttribute("animalType", firstAccount.getAnimalType());
    model.addAttribute("balance", firstAccount.getBalance());
    return "account";
  }

}
