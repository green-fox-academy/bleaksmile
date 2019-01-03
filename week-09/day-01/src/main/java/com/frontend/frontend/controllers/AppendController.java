package com.frontend.frontend.controllers;

import com.frontend.frontend.models.Append;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendController {

  @GetMapping("/appenda/{appendable}")
  public Object append(@PathVariable("appendable") String appendable){
    return new Append(appendable);
  }

}
