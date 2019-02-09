package com.greenfoxacademy.bankofsimba.bankofsimba;

import java.text.DecimalFormat;

public class BankAccount {

  public static final DecimalFormat df2 = new DecimalFormat("#.00");
  public static final String currency = "Flamingos";

  private String name;
  private String balance;
  private String animalType;
  private boolean king;
  private boolean goodGuy;

  public BankAccount(String name, int balance, String animalType, boolean king, boolean goodGuy) {
    this.name = name;
    this.balance = df2.format(balance);
    this.animalType = animalType;
    this.king = king;
    this.goodGuy = goodGuy;
  }

  public String getName() {
    return name;
  }

  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public String getCurrency() {
    return currency;
  }

  public boolean isKing() {
    return king;
  }

  public boolean isGoodGuy() {
    return goodGuy;
  }

  public void setGoodGuy(boolean goodGuy) {
    this.goodGuy = goodGuy;
  }
}
