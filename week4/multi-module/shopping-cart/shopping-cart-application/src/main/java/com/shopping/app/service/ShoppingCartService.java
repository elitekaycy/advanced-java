package com.shopping.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shopping.cart.domain.aggregates.ShoppingCart;
import com.shopping.cart.domain.entities.Cart;
import com.shopping.cart.domain.repository.ShoppingCartRepository;

@Service
public class ShoppingCartService {
  private final ShoppingCartRepository repository;

  public ShoppingCartService(ShoppingCartRepository repository) {
    this.repository = repository;
  }

  public String createCart(String id, String customerId, List<Cart> carts) {
    ShoppingCart cart = new ShoppingCart(id, customerId, carts);
    repository.save(cart);
    return cart.getId();
  }

  public void deleteCart(String cartId) {
    repository.delete(cartId);
  }

  public ShoppingCart getCart(String id) {
    return repository.findById(id);
  }
}
