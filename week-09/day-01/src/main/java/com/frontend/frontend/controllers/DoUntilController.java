package com.frontend.frontend.controllers;

import com.frontend.frontend.models.ErrorMessage;
import com.frontend.frontend.models.Result;
import com.frontend.frontend.models.Until;
import com.frontend.frontend.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUntilController {

  @Autowired
  private ResultService resultService;


  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable("action") String action, @RequestBody(required = false) Until until){
    Integer number = until.getUntil();
    if(until == null){
      return new ErrorMessage("Please provide a number!");
    } else if(action.equals("sum")){
      return new Result(resultService.sum(number));
    } else {
      return new Result(resultService.factor(number));
    }
  }

}
