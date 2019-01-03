package com.frontend.frontend.models;

import org.springframework.stereotype.Component;

@Component
public class Result {
  private Integer result;

  public Result(Integer result) {
    this.result = result;
  }

  public Result() {
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
