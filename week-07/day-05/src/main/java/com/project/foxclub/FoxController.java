package com.project.foxclub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class FoxController {
  @Autowired
  FoxService foxService;

  @GetMapping("/nutritionStore")
  public String nutrition(Model model, @RequestParam(value = "name", required = false) String name) {
    Optional<Fox> optionalFox = foxService.findFox(name);
    if (name == null || !optionalFox.isPresent()) {
      return "redirect:/login";
    } else {
      model.addAttribute("fox", optionalFox.get());
    }
    return "nutrition";
  }

  @PostMapping("/nutritionStore/add")
  public String addNutrition(@RequestParam(value = "name", required = false) String name, @ModelAttribute("food") String food, @ModelAttribute("drink") String drink, RedirectAttributes attributes){
    Optional<Fox> optionalFox = foxService.findFox(name);
    optionalFox.get().setDrink(drink);
    optionalFox.get().setFood(food);
    attributes.addAttribute("name", name);
    return "redirect:/";
  }

  @GetMapping("/trickCenter")
  public String trick(Model model, @RequestParam(value = "name", required = false) String name) {
    Optional<Fox> optionalFox = foxService.findFox(name);
    if (name == null || !optionalFox.isPresent()) {
      return "redirect:/login";
    } else {
      model.addAttribute("fox", optionalFox.get());
    }
    return "trick";
  }

  @PostMapping("/trickCenter/add")
  public String addTrick(@RequestParam(value = "name", required = false) String name, @ModelAttribute("trick") String trick, RedirectAttributes attributes) {
    Optional<Fox> optionalFox = foxService.findFox(name);
    if(!optionalFox.get().getTricks().contains(trick)) {
      optionalFox.get().addTrick(trick);
    }
    attributes.addAttribute("name",name);
    return "redirect:/";
  }


}
