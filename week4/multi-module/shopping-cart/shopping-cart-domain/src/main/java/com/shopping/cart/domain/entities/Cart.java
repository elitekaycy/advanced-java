package com.shopping.cart.domain.entities;

public class Cart {
  private String name;
  private int price;

  public Cart(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }
}
