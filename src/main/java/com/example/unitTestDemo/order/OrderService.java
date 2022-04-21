package com.example.unitTestDemo.order;

import com.example.unitTestDemo.cart.CartRepository;
import com.example.unitTestDemo.cart.CartService;
import com.example.unitTestDemo.product.Product;
import com.example.unitTestDemo.product.ProductRepository;
import com.example.unitTestDemo.user.UserRepository;
import com.example.unitTestDemo.wishlist.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
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

    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    public void removeOrder(Order order) {
        orderRepository.delete(order);
    }

    public void updateOrder(Order order) {
        orderRepository.save(order);
    }
}
