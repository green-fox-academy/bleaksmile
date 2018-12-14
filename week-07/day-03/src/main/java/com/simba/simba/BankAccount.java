package com.simba.simba;

public class BankAccount {
  private String name;
  private Double balance;
  private String animalType;
  private Boolean isKing;
  private String badOrGood;

  public BankAccount(String name, Double balance, String animalType, Boolean isKing, String badOrGood) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.badOrGood = badOrGood;
  }

  public String getBadOrGood() {
    return badOrGood;
  }

  public Boolean isKing() {
    return isKing;
  }
  public String getName() {
    return name;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public void setKing(Boolean king) {
    isKing = king;
  }

  public void setBadOrGood(String badOrGood) {
    this.badOrGood = badOrGood;
  }

  public String getAnimalType() {
    return animalType;
  }
}


