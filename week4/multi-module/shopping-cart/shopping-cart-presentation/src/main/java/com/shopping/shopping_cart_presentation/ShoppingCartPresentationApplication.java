package com.shopping.shopping_cart_presentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
    "com.shopping.app",
    "com.shopping.cart",
    "com.shopping.infra"
})
public class ShoppingCartPresentationApplication {
  public static void main(String[] args) {
    SpringApplication.run(ShoppingCartPresentationApplication.class, args);
  }
}
