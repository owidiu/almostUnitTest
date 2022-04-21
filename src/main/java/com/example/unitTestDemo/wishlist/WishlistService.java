package com.example.unitTestDemo.wishlist;

import com.example.unitTestDemo.cart.CartRepository;
import com.example.unitTestDemo.order.OrderRepository;
import com.example.unitTestDemo.product.ProductRepository;
import com.example.unitTestDemo.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishlistService {
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

    public void addToWishlist(Integer userId, Integer productId) {
        if (userRepository.findById(userId).isPresent() && productRepository.findById(productId).isPresent()) {
            Wishlist wishlist = new Wishlist();
            wishlistRepository.save(wishlist);
        }
    }

    public void removeFromWishlist(Integer userId, Integer productId) {
        if (userRepository.findById(userId).isPresent() && productRepository.findById(productId).isPresent()) {
            wishlistRepository.deleteByUserIdAndProductId(userId, productId);
        }
    }
}
