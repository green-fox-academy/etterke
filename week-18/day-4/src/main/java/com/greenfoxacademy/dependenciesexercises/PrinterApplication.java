package com.greenfoxacademy.dependenciesexercises;

import com.greenfoxacademy.dependenciesexercises.Services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrinterApplication implements CommandLineRunner {

  private Printer printer;

  @Autowired
  PrinterApplication(Printer printer){
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependenciesexercisesApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("Hello");
  }
}


