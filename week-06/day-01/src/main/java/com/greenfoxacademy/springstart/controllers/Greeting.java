package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  long id;
  String content;
  static AtomicLong atomic = new AtomicLong(0);

  public Greeting(String content) {
    this.id = atomic.incrementAndGet();
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
