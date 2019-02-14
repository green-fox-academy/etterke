package com.greenfoxacademy.dependenciesexercises;

import com.greenfoxacademy.dependenciesexercises.Services.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpellCheckerApplication implements CommandLineRunner {

  private SpellChecker checker;

  @Autowired
  SpellCheckerApplication(SpellChecker checker) {
    this.checker = checker;
  }

  public static void main(String[] args) {
    SpringApplication.run(SpellCheckerApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    checker.checkSpelling();
  }
}