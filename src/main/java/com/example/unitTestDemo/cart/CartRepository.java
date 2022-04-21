package com.example.unitTestDemo.cart;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {
    Cart findByUserId(Integer userId);

    void addProductToCart(Long userId, Long productId);

    void deleteProductFromCart(Long userId, Long productId);
}
