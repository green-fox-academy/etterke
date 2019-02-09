package com.greenfoxacademy.bankofsimba.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.bankofsimba.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {

  BankAccount firstAccount = new BankAccount("Simba", 30000, "lion", true, true);
  List<BankAccount> accountList = new ArrayList<>();

  public AccountController(){
    accountList.add(firstAccount);
    accountList.add(new BankAccount("Scar", 250, "lion", false, false));
    accountList.add(new BankAccount("Mufasa", 23000, "lion", true, true));
    accountList.add(new BankAccount("Pumbaa", 3789, "warthog", false, true));
    accountList.add(new BankAccount("Timon", 8374, "meerkat", false, true));
    accountList.add(new BankAccount("Ed", 3782, "hyena", false, false));
    accountList.add(new BankAccount("Zazu", 234, "hornbill", false, true));
    accountList.add(new BankAccount("Rafiki", 383983, "baboon", false, true));
    accountList.add(new BankAccount("Nala", 38927, "lion", false, true));
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

  @RequestMapping("/showAllAccounts/whoIsTheKing")
  public String showAllAccountsWithKing(Model model) {
    model.addAttribute("accountList", accountList);
    return "accountListWithKing";
  }

  @RequestMapping("/showAllAccounts/whoIsTheKing/andTheGoodGuys")
  public String showAllAccountsWithKingAndGoodGuys(Model model) {
    model.addAttribute("accountList", accountList);
    return "accountListWithKingAndGoodGuys";
  }

}
