package com.greenfox.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpellcheckerApplication implements CommandLineRunner {
  @Autowired
  Printer printer;
  @Autowired
  MyColor color;

  public static void main(String[] args) {
    SpringApplication.run(SpellcheckerApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    color.printColor();
  }
}
