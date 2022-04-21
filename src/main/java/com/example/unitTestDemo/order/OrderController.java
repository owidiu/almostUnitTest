package com.example.unitTestDemo.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("addOrder")
    public void addOrder(Order order) {
        orderService.addOrder(order);
    }

    @PostMapping("updateOrder")
    public void updateOrder(Order order) {
        orderService.updateOrder(order);
    }

    @PostMapping("deleteOrder")
    public void removeOrder(Order order) {
        orderService.removeOrder(order);
    }
}
