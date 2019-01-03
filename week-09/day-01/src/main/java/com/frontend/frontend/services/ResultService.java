package com.frontend.frontend.services;

import com.frontend.frontend.models.Result;
import org.springframework.stereotype.Service;

@Service
public class ResultService {

  private Result result;

  public Integer sum(Integer number){
    Integer sum =0;
    for (Integer i = number; i >0 ; i--) {
      sum +=i;
    }
    return sum;
  }

  public Integer factor(Integer number){
    Integer factor =1;
    for (Integer i = number; i >0 ; i--) {
      factor *=i;
    }
    return factor;
  }


}
