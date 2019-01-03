package com.frontend.frontend.controllers;

import com.frontend.frontend.models.Doubled;
import com.frontend.frontend.models.ErrorMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      return new Doubled(input);
    } else {
      ErrorMessage error = new ErrorMessage("Please provide an input!");
      return error;
    }
  }
}

