package com.example.unitTestDemo.product;

import com.example.unitTestDemo.cart.CartRepository;
import com.example.unitTestDemo.order.OrderRepository;
import com.example.unitTestDemo.user.UserRepository;
import com.example.unitTestDemo.wishlist.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    CartRepository cartRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    WishlistRepository wishlistRepository;

    public void addProductToCart(Long userId, Long productId) {
        cartRepository.addProductToCart(userId, productId);
    }

    public void addProductToOrder(Long userId, Long productId) {
        orderRepository.addProductToOrder(userId, productId);
    }

    public void addProductToWishlist(Long userId, Long productId) {
        wishlistRepository.addProductToWishlist(userId, productId);
    }

    public void deleteProductFromCart(Long userId, Long productId) {
        cartRepository.deleteProductFromCart(userId, productId);
    }

    public void deleteProductFromOrder(Long userId, Long productId) {
        orderRepository.deleteProductFromOrder(userId, productId);
    }

    public void deleteProductFromWishlist(Long userId, Long productId) {
        wishlistRepository.deleteProductFromWishlist(userId, productId);
    }
}
