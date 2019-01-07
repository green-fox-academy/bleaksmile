package com.frontend.frontend.models;

import org.springframework.stereotype.Component;

@Component
public class Result {
  private Object result;

  public Result(Object result) {
    this.result = result;
  }

  public Result() {
  }

  public Object getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
