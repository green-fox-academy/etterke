package com.greenfoxacademy.urlshortening.Models;

public class Success {

  private String successMessage;

  public Success() {
  }

  public Success(String successMessage) {
    this.successMessage = successMessage;
  }

  public String getSuccessMessage() {
    return successMessage;
  }

  public void setSuccessMessage(String successMessage) {
    this.successMessage = successMessage;
  }
}
