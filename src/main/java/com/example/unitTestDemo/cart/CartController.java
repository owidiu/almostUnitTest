package com.example.unitTestDemo.cart;

import com.example.unitTestDemo.product.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CartController {
    private CartService cartService;

    @PostMapping("/addProductToCart/{userId}")
    public void addProductToCart(Integer userId, Product product) {
        cartService.addProductToCart(userId, product);
    }

    @DeleteMapping("/removeProductFromCart/{userId}")
    public void removeProductFromCart(@PathVariable Integer userId, Product product) {
        cartService.removeProductFromCart(userId, product);
    }

    @GetMapping("/getProductsInCart/{userId}")
    public List<Product> getProductsInCart(@PathVariable Integer userId) {
        return cartService.getProductsInCart(userId);
    }

    @DeleteMapping("/clearCart/{userId}")
    public void removeAllProductsFromCart(@PathVariable Integer userId) {
        cartService.removeAllProductsFromCart(userId);
    }

}

