package com.example.unitTestDemo.user;

import com.example.unitTestDemo.cart.CartRepository;
import com.example.unitTestDemo.order.OrderRepository;
import com.example.unitTestDemo.product.ProductRepository;
import com.example.unitTestDemo.wishlist.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
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

    //create user
    public User createUser(User user) {
        return userRepository.save(user);
    }

    //get user
    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    //update user
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    //delete user
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

}
