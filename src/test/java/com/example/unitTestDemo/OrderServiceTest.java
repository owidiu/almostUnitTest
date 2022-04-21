package com.example.unitTestDemo;

import com.example.unitTestDemo.order.OrderService;
import com.example.unitTestDemo.user.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderServiceTest {
    @Autowired
    OrderService orderService;

    @Autowired
    UserService userService;

    @Test
    public void should_add_order() {
        //orderService.addOrder();
    }

    }

