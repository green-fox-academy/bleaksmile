package com.greenfoxacademy.springstart.controllers;

import java.util.Random;

public class Attribute {
  int fontSize;
  String fontColor;
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  Random random = new Random();

  public Attribute() {
  }

  public String getHellos() {
    int randomID = random.nextInt(hellos.length);
    return hellos[randomID];
  }

  public int getFontSize() {
    fontSize = random.nextInt(18) + 18;
    return fontSize;
  }

  public String getFontColor() {
    int randomColor = random.nextInt(0xffffff + 1);
    fontColor =String.format("#%06x", randomColor);
    return fontColor;
  }
}
