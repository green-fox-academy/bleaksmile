package com.greenfox.demo;

import org.springframework.stereotype.Service;


public class Brown implements MyColor {

  @Override
  public void printColor() {
    System.out.println("This is brown color");


  }
}
