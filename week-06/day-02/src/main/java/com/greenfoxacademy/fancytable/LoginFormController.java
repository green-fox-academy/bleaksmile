package com.greenfoxacademy.fancytable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginFormController {
  @GetMapping("/loginForm")
  public String login(){
    return "loginForm";
  }
}
