package com.greenfox.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
  UtilityService utilityService;

  public HomeController(UtilityService utility) {
    this.utilityService = utility;
  }

  @GetMapping("/useful")
  public String home(){
    return "home";
  }

  @GetMapping("/useful/colored")
  public String colored(Model model){
    model.addAttribute("color",utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String email(Model model,@RequestParam(value ="address") String email ){
    model.addAttribute("email", email);
    String color = utilityService.validateEmail(email);
    model.addAttribute("textColor",color);
    return "email";
  }

  @GetMapping("/useful/encode")
  public String encode(Model model, @RequestParam("text") String text, @RequestParam ("number") int number) {
    model.addAttribute("decoded",utilityService.caesar(text,number));
    model.addAttribute("text", text);
    model.addAttribute("number", number);
    return "encode";
  }

  @GetMapping("/useful/decode")
  public String decode(Model model, @RequestParam("text") String text, @RequestParam ("number") int number) {
    model.addAttribute("decoded",utilityService.caesar(text,-number));
    model.addAttribute("text", text);
    model.addAttribute("number", number);
    return "encode";
  }
}
