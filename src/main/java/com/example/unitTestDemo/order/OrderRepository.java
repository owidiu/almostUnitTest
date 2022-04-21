package com.example.unitTestDemo.order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
    void addProductToOrder(Long userId, Long productId);

    void deleteProductFromOrder(Long userId, Long productId);
}
