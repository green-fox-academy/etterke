package com.greenfoxacademy.frontend.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
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

  public String reverseSith(String text) {
    String[] sentences = text.split("\\.");
    String swappedSentence = "";
    String sithText = "";

    for (String sentence : sentences) {
      swappedSentence = swap(sentence);
      sithText += swappedSentence;
    }
    return sithText;
  }

  public String swap(String sentence) {
    ArrayList<String> wordsOfSentence = new ArrayList<>(Arrays.asList(sentence.split(" ")));

    if(wordsOfSentence.size() % 2 == 0){
      for (int i = 0; i < wordsOfSentence.size(); i+=2) {
        wordsOfSentence.get(0).toLowerCase();
        String temp = wordsOfSentence.get(i);
        wordsOfSentence.set(i, wordsOfSentence.get(i + 1));
        wordsOfSentence.set((i + 1), temp);
      }
    } else {
      for (int i = 0; i < wordsOfSentence.size() - 1; i+=2) {
        wordsOfSentence.get(0).toLowerCase();
        String temp = wordsOfSentence.get(i);
        wordsOfSentence.set(i, wordsOfSentence.get(i + 1));
        wordsOfSentence.set((i + 1), temp);
      }
    }

    String swappedSentence = "";
    for (String word : wordsOfSentence) {
      swappedSentence += word + " ";
    }
    return swappedSentence;
  }
}
