package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloSayController {

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam String name) {
    Greeting greet = new Greeting(name);
    Attribute attrib = new Attribute();
    model.addAttribute("fontSize", attrib.getFontSize());
    model.addAttribute("fontColor", attrib.getFontColor());
    model.addAttribute("hello",attrib.getHellos());
    model.addAttribute("name",greet.getContent());
    model.addAttribute("ID", greet.getId());

    return "greeting";
  }
}
