package com.greenfoxacademy.frontend.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestService {

  public int addUp(List<Integer> numbers) {
    int sum = 0;

    for (int i = 0; i < numbers.size(); i++) {
      sum += numbers.get(i);
    }
    return sum;
  }

  public int multiply(List<Integer> numbers) {
    int result = 1;

    for (int i = 0; i < numbers.size(); i++) {
      result *= numbers.get(i);
    }
    return result;
  }

  public List<Integer> doubleNumbers(List<Integer> numbers) {
    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < numbers.size(); i++) {
      result.add(numbers.get(i) * 2);
    }
    return result;
  }
}
