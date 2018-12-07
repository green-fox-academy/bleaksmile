package com.greenfoxacademy.webshop;

import java.util.ArrayList;
import java.util.List;

public class Table {
  private List<Item> table;
  private static Table instance;

  private Table() {
    this.table = new ArrayList<>();
    table.add(new Item("Running shoes", "Nike running shoes for every day sport", 19990, 5));
    table.add(new Item("Printer", "Some HP printer that will print pages", 10990, 2));
    table.add(new Item("Coca cola", "0.5l standard coke", 500, 0));
    table.add(new Item("Wokin", "Chicken with fried rice and WOKIN sauce", 1500, 100));
    table.add(new Item("T-shirt", "Blue with a corgi on a bike", 6000, 1));
  }

  public static Table getInstance() {
    if (instance == null) {
      instance = new Table();
    }
    return instance;
  }

  public List<Item> getTable() {
    return table;
  }
}
