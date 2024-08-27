package com.shopping.cart.domain.repository;

import com.shopping.cart.domain.aggregates.ShoppingCart;

public interface ShoppingCartRepository {

  void save(ShoppingCart cart);

  void delete(String cartId);

  ShoppingCart findById(String cartId);
}
