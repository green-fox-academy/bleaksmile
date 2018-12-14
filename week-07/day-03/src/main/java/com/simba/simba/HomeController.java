package com.simba.simba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
  List<BankAccount> accounts;

  public HomeController() {
    this.accounts = new ArrayList<>();
    accounts.add(new BankAccount("Nala", 4000., "lion", true, "Good One"));
    accounts.add(new BankAccount("Timon", 3500., "meerkat", false, "Bad Guy"));
    accounts.add(new BankAccount("Pumba", 1500., "warthog", false, "Good One"));
    accounts.add(new BankAccount("Simba", 2000., "lion", true, "Good One"));
    accounts.add(new BankAccount("Zazu", 1000., "hornbill", false, "Bad Guy"));
  }
  public List<BankAccount> getAccounts() {
    return accounts;
  }

  @GetMapping("/show")
  public String home(Model model) {
    BankAccount account1 = new BankAccount("Simba", 2000., "lion", true, "Good One");
    model.addAttribute("account", account1);
    return "index";
  }

  @GetMapping("/string")
  public String string(Model model) {
    model.addAttribute("html", "<em>HTML</em>");
    model.addAttribute("enjoy", "<b>Enjoy yourself!</b>");
    return "string";
  }

  public void topuUp(String name){
    for (BankAccount account: accounts) {
      if(account.getAnimalType().equals(name)&& account.isKing() ){
        account.setBalance(account.getBalance()+100);
      } else if (account.getAnimalType().equals(name)){
        account.setBalance(account.getBalance()+10);
      }
    }
  }


  @RequestMapping(value ="/list", method = RequestMethod.GET)
  public String multipleAccounts(Model model, @ModelAttribute(value="single") BankAccount singleBankAccount) {
    model.addAttribute("accounts", accounts);
    model.addAttribute("single", singleBankAccount);
    return "list";
  }

  @RequestMapping(value = "/list", method = RequestMethod.POST)
  public String increase(@ModelAttribute (value ="typeOfAnimal") String name){
    topuUp(name);
    //model.addAttribute("accounts",accounts);
    return  "redirect:/list";
  }

  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public String newAccount(@ModelAttribute BankAccount singleAccount){
    accounts.add(singleAccount);
    System.out.println(singleAccount.getAnimalType());
    return  "redirect:/list";
  }

/*  @RequestMapping(value = "/list", method = RequestMethod.POST)
  public String createAccount(Model model, @ModelAttribute (value ="name") String name){
    accounts.add(new BankAccount(name,6000,"wolf",true,"Bad Guy"));
    model.addAttribute("accounts",accounts);
    return  "list";
  }*/

}