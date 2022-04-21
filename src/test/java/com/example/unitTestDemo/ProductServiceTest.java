package com.example.unitTestDemo;

import com.example.unitTestDemo.product.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductServiceTest {
    @Autowired
    private ProductService productService;

    @Test
    public void should_add_product_to_cart() {

    }

    @Test
    //test if remove product from cart
    public void should_remove_product_from_cart() {

    }

}
