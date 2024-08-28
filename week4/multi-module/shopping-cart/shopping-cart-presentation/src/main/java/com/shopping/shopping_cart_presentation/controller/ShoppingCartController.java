package com.shopping.shopping_cart_presentation.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.shopping.cart.domain.aggregates.ShoppingCart;
import com.shopping.cart.domain.entities.Cart;
import com.shopping.app.service.ShoppingCartService;

@RestController
@RequestMapping("/carts")
public class ShoppingCartController {
  private final ShoppingCartService cartService;

  public ShoppingCartController(ShoppingCartService cartService) {
    this.cartService = cartService;
  }

  @PostMapping
  public ResponseEntity<String> createCart(@RequestParam String customerId) {
    String id = UUID.randomUUID().toString();
    List<Cart> carts = List.of(new Cart(UUID.randomUUID().toString(), 200));
    String cartId = cartService.createCart(id, customerId, carts);
    return ResponseEntity.ok(cartId);
  }

  @DeleteMapping("/{cartId}")
  public ResponseEntity<Void> deleteCart(@PathVariable String cartId) {
    cartService.deleteCart(cartId);
    return ResponseEntity.noContent().build();
  }

  @GetMapping("/{cartId}")
  public ResponseEntity<ShoppingCart> getCart(@PathVariable String cartId) {
    ShoppingCart cart = cartService.getCart(cartId);
    if (cart == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(cart);
  }

  @GetMapping
  public ResponseEntity<String> getCarts() {
    return ResponseEntity.ok("test working!!!");
  }
}
