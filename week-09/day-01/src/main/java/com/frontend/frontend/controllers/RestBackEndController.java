package com.frontend.frontend.controllers;

import com.frontend.frontend.models.*;
import com.frontend.frontend.repositories.LogRepository;
import com.frontend.frontend.services.LogService;
import com.frontend.frontend.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestBackEndController {

  @Autowired
  ResultService resultService;

  @Autowired
  LogService logService;


  @GetMapping("/appenda/{appendable}")
  public Object append(@PathVariable("appendable") String appendable){
    logService.save(new Log("/appenda",appendable));
    return new Append(appendable);
  }

  @PostMapping("/arrays")
  public Result arrayHandler(@RequestBody ArrayHandler arrayHandler) {
    logService.save(new Log("/arrays",arrayHandler.toString()));

    if (arrayHandler != null) {
      if (arrayHandler.getWhat().equals("sum")) {
        return new Result(resultService.sumAll(arrayHandler.getNumbers()));
      } else if (arrayHandler.getWhat().equals("multiply")){
        return new Result(resultService.multiplyAll(arrayHandler.getNumbers()));
      } else{
        return new Result(resultService.doubleAll(arrayHandler.getNumbers()));
      }
    } else {
      throw new UnsupportedOperationException("Please provide what to do with the numbers!");
    }
  }

  @GetMapping("/doubling")
  public Doubled doubling(@RequestParam(value = "input", required = false) Integer input) {
    logService.save(new Log("/doubling","input="+ input));
    if (input != null) {
      return new Doubled(input);
    } else {
      throw  new UnsupportedOperationException("Please provide an input!");
    }
  }


  @PostMapping("/dountil/{action}")
  public Result doUntil(@PathVariable("action") String action, @RequestBody(required = false) Until until){
    logService.save(new Log("/dountil", until.toString()));
    Integer number = until.getUntil();
    if(until == null){
      throw new  UnsupportedOperationException("Please provide a number!");
    } else if(action.equals("sum")){
      return new Result(resultService.sumUntil(number));
    } else {
      return new Result(resultService.factor(number));
    }
  }

  @GetMapping("/greeter")
  public Greeting greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    logService.save(new Log("/greeting", "name=" + name+ "; " + "title=" + title));
    if (name == null && title == null) {
      throw  new UnsupportedOperationException("Please provide a name and a title!");
    } else if(name == null){
      throw new UnsupportedOperationException("Please provide a name!");
    } else if (title == null) {
      throw  new UnsupportedOperationException("Please provide a title!");
    } else {
      return new Greeting(name, title);
    }

  }

  @GetMapping("/log")
  public LogService logEntries(){
    logService.fetch();
    return logService;
  }

}
