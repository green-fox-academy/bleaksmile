package com.project.foxclub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class MainController {
  @Autowired
  FoxService foxService;

/*  public MainController(FoxService foxService ) {
    this.foxService = foxService;
  }*/

  @RequestMapping("/")
  public String home(Model model, @RequestParam(value="name", required=false) String name) {
    Optional<Fox> optionalFox = foxService.findFox(name);
    if (name == null || !optionalFox.isPresent()) {
      return "redirect:/login";
    } else {
        model.addAttribute("fox", optionalFox.get());
    }
    return "index";
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  public String register(@RequestParam("name") String name, RedirectAttributes attributes) {
    foxService.addFox(name);
    attributes.addAttribute("name",name);
    return "redirect:/";
  }


}
