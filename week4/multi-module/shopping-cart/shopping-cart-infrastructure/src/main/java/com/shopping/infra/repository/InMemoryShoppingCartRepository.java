package com.shopping.infra.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.shopping.cart.domain.aggregates.ShoppingCart;
import com.shopping.cart.domain.repository.ShoppingCartRepository;

@Repository
public class InMemoryShoppingCartRepository implements ShoppingCartRepository {
  private final Map<String, ShoppingCart> carts = new HashMap<>();

  @Override
  public void save(ShoppingCart cart) {
    carts.put(cart.getId(), cart);
  }

  @Override
  public void delete(String cartId) {
    carts.remove(cartId);
  }

  @Override
  public ShoppingCart findById(String cartId) {
    return carts.get(cartId);
  }
}
