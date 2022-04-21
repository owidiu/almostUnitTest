package com.example.unitTestDemo.cart;

import com.example.unitTestDemo.product.Product;
import com.example.unitTestDemo.user.User;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @OneToOne
    private User user;

    @OneToMany
    private List<Product> products;

    public void addProduct(Product product) {
        products.add(product);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserId(Integer userId) {
    }

    public void setProducts(Product product) {
    }

    public List<Product> getProducts() {
        return products;
    }
}
