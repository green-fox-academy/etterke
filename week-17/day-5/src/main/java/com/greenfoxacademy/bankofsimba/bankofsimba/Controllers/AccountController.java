package com.greenfoxacademy.bankofsimba.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.bankofsimba.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

  @RequestMapping(value = "raiseMoney", method = RequestMethod.GET)
  public String raiseMoneyForm(Model model) {
    String type = new String();

    for (BankAccount account : accountList) {
      type = account.getAnimalType();
    }

    model.addAttribute("animalType", type);
    return "raiseMoney";
  }

  @RequestMapping(value = "raiseMoney", method = RequestMethod.POST)
  public String raiseMoney(BankAccount account){
    if (account.getAnimalType().equals("Lion")){
      account.setBalance(100);
    }else{
      account.setBalance(10);
    }
    return "redirect:accountListWithKingAndGoodGuys";
  }
}
