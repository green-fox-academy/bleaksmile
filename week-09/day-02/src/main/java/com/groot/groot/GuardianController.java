package com.groot.groot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity grootIndex(@RequestParam(value = "message", required = false) String message ){
    if(message != null){
      GrootRespond groot = new GrootRespond(message);
      return ResponseEntity.ok(groot);
    }else{
      RespondErrorMsg error = new RespondErrorMsg("I am Groot!");
      return ResponseEntity.badRequest().body(error);
    }
  }
}
