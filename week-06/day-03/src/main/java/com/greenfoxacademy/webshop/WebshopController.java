package com.greenfoxacademy.webshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/webshop")
public class WebshopController {
  Table myTable = Table.getInstance();

  @RequestMapping
  public String index(Model model) {
    model.addAttribute("items", myTable.getTable());
    return "webshop";
  }

  @GetMapping("/only-available")
  public String onlyAvailable(Model model){
   List<Item> onlyAvail = myTable.getTable().stream().filter(item -> item.getQuantity()>0 ).collect(Collectors.toList());
   model.addAttribute("items", onlyAvail);
   return "webshop";
  }

  @GetMapping("/cheapest-first")
  public String cheapestFirst(Model model){
    List<Item> cheapestFirst = myTable.getTable().stream().sorted(Comparator.comparing(Item::getPrice)).collect(Collectors.toList());
    model.addAttribute("items", cheapestFirst);
    return "webshop";
  }

  @GetMapping("/contains-nike")
  public String nike(Model model){
    List<Item> nike = myTable.getTable().stream()
            .filter(item-> item.getDescription().contains("Nike"))
            .collect(Collectors.toList());
    model.addAttribute("items", nike);
    return "webshop";
  }

  @GetMapping("/average-stock")
  public String avgStock(Model model){
    Double avg = myTable.getTable().stream().
            collect(Collectors.averagingDouble(item -> item.getQuantity()));
    model.addAttribute("avg", avg);
    return "avg";
  }

  @GetMapping("/most-expensive")
  public String mostExpensive(Model model){
    String itemName = myTable.getTable().stream()
            .max(Comparator.comparing(Item::getPrice)).get().getName();

    model.addAttribute("itemName", itemName);
    return "avg";
  }

  @PostMapping("/search")
  public String search(Model model, @RequestParam("search") String name){
    List<Item> found = myTable.getTable().stream()
            .filter(item -> item.getDescription().toLowerCase().contains(name.toLowerCase()) || item.getName().toLowerCase().contains(name.toLowerCase()))
            .collect(Collectors.toList());
    model.addAttribute("items", found);
    return "webshop";
  }

}
