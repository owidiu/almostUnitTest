package com.example.unitTestDemo.product;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    public void addProductToCart(Long userId, Long productId) {
        productService.addProductToCart(userId, productId);
    }

    public void addProductToOrder(Long userId, Long productId) {
        productService.addProductToOrder(userId, productId);
    }

    public void addProductToWishlist(Long userId, Long productId) {
        productService.addProductToWishlist(userId, productId);
    }

    public void deleteProductFromCart(Long userId, Long productId) {
        productService.deleteProductFromCart(userId, productId);
    }

    public void deleteProductFromOrder(Long userId, Long productId) {
        productService.deleteProductFromOrder(userId, productId);
    }

    public void deleteProductFromWishlist(Long userId, Long productId) {
        productService.deleteProductFromWishlist(userId, productId);
    }
}


