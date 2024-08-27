package com.shopping.cart.domain.aggregates;

import java.util.List;

import com.shopping.cart.domain.entities.Cart;

public class ShoppingCart {

  private final String id;
  private final String customerId;
  private final List<Cart> carts;

  public ShoppingCart(String id, String customerId, List<Cart> carts) {
    this.id = id;
    this.customerId = customerId;
    this.carts = carts;
  }

  public String getId() {
    return id;
  }

  public String getCustomerId() {
    return customerId;
  }

  public List<Cart> getCarts() {
    return carts;
  }
}
