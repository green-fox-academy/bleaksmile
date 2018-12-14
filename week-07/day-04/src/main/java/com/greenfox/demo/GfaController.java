package com.greenfox.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GfaController {
  StudentService names;

  @Autowired
  public GfaController(StudentService studentService) {
    this.names = studentService;
  }

  @GetMapping("/gfa")
  public String index(Model model){
    model.addAttribute("students",names.findAll());
    model.addAttribute("count", names.count());
    return "gfa";
  }

  @GetMapping("/gfa/list")
  public String list(Model model){
    model.addAttribute("students",names.findAll());
    return "gfa2";
  }

  @GetMapping("/gfa/add")
  public String renderForm(Model model, @ModelAttribute("name") String name){
    model.addAttribute("name",name);
    return "gfa3";
  }

  @GetMapping("/gfa/save")
  public String add(@ModelAttribute("name") String name){
    names.save(name);
    return "redirect:/gfa/list";
  }

  @GetMapping("/gfa/checker")
  public String studentChecker(Model model, @ModelAttribute("name") String name){
    model.addAttribute("status", names.check(name));
    return "gfa4";
  }

/*  @PostMapping("/gfa/checker")
  public String checker(Model model, @ModelAttribute("name") String name){
    model.addAttribute("status", names.check(name));
    return "gfa4";
  }*/
}
