package com.frontend.frontend.services;

import com.frontend.frontend.models.Result;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ResultService {

  private Result result;

  public ResultService() {
  }

  public ResultService(Result result) {
    this.result = result;
  }

  public Integer sumUntil(Integer number){
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

  public Integer sumAll(ArrayList<Integer> numbers){
    return numbers.stream().mapToInt(i->i).sum();
  }

  public Integer multiplyAll(ArrayList<Integer> numbers){
    return numbers.stream().reduce(1,(a,b) -> a * b);

  }

  public ArrayList<Integer> doubleAll(ArrayList<Integer> numbers){
    ArrayList<Integer> doubledArray = new ArrayList<>();
    for (Integer number: numbers) {
      doubledArray.add(number*2);
    }
    return doubledArray;
  }


}
