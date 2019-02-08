package com.greenfoxacademy.bankofsimba.bankofsimba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {

  BankAccount firstAccount = new BankAccount("Simba", 30000, "lion");
  List<BankAccount> accountList = new ArrayList<>();

  public AccountController(){
    accountList.add(firstAccount);
    accountList.add(new BankAccount("Scar", 250, "lion"));
    accountList.add(new BankAccount("Mufasa", 23000, "lion"));
    accountList.add(new BankAccount("Pumbaa", 3789, "warthog"));
    accountList.add(new BankAccount("Timon", 8374, "meerkat"));
    accountList.add(new BankAccount("Ed", 3782, "hyena"));
    accountList.add(new BankAccount("Zazu", 234, "hornbill"));
    accountList.add(new BankAccount("Rafiki", 383983, "baboon"));
    accountList.add(new BankAccount("Nala", 38927, "lion"));
  }

  @RequestMapping("/show")
  public String showAccount(Model model) {
    model.addAttribute("bankAccount", firstAccount);
    return "account";
  }

  @RequestMapping("/showAllAccounts")
  public String showAllAccounts(Model model) {
    model.addAttribute("accountList", accountList);
    return "accountList";
  }

}
