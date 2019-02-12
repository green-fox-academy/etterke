package com.greenfoxacademy.bankofsimba.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.bankofsimba.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {

  BankAccount firstAccount = new BankAccount("Simba", 300, "lion", true, true);
  List<BankAccount> accountList = new ArrayList<>();

  public AccountController(){
    accountList.add(firstAccount);
    accountList.add(new BankAccount("Scar", 25, "lion", false, false));
    accountList.add(new BankAccount("Mufasa", 500, "lion", true, true));
    accountList.add(new BankAccount("Pumbaa", 100, "warthog", false, true));
    accountList.add(new BankAccount("Timon", 110, "meerkat", false, true));
    accountList.add(new BankAccount("Ed", 40, "hyena", false, false));
    accountList.add(new BankAccount("Zazu", 250, "hornbill", false, true));
    accountList.add(new BankAccount("Rafiki", 400, "baboon", false, true));
    accountList.add(new BankAccount("Nala", 280, "lion", false, true));
  }

  @GetMapping("/show")
  public String showAccount(Model model) {
    model.addAttribute("bankAccount", firstAccount);
    return "account";
  }

  @GetMapping("/showAllAccounts")
  public String showAllAccounts(Model model) {
    model.addAttribute("accountList", accountList);
    return "accountList";
  }

  @GetMapping("/showAllAccounts/whoIsTheKing")
  public String showAllAccountsWithKing(Model model) {
    model.addAttribute("accountList", accountList);
    return "accountListWithKing";
  }

  @GetMapping("/showAllAccounts/whoIsTheKing/andTheGoodGuys")
  public String showAllAccountsWithKingAndGoodGuys(Model model) {
    model.addAttribute("accountList", accountList);
    return "accountListWithKingAndGoodGuys";
  }

  @GetMapping("/raiseMoney")
  public String raiseMoneyForm(Model model) {
    model.addAttribute("accountList", accountList);
    return "raiseMoney";
  }

  @PostMapping("/raiseMoney")
  public String raiseMoney(@ModelAttribute (value="animal-name") String name){

    for (BankAccount account : accountList) {
      if (account.getName().equalsIgnoreCase(name)){
        if(account.isKing()) {
          account.setBalance(account.getBalance() + 100);
        } else {
          account.setBalance(account.getBalance() + 10);
        }
      }
    }
    return "redirect:/showAllAccounts/whoIsTheKing/andTheGoodGuys";
  }

  @GetMapping("/addAccount")
  public String addAccountForm() {
    return "addAccount";
  }

  @PostMapping("/addAccount")
  public String addAccount(BankAccount account) {
    accountList.add(account);
    return "redirect:/showAllAccounts/whoIsTheKing/andTheGoodGuys";
  }

}
