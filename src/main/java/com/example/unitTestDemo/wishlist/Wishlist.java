package com.example.unitTestDemo.wishlist;

import com.example.unitTestDemo.product.Product;
import com.example.unitTestDemo.user.User;

import javax.persistence.*;
import java.util.List;

@Entity
public class Wishlist {
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

    public void setUserId(int i) {
    }

    public void setProductId(int i) {
    }

    public int getUserId() {
        return getUserId();
    }

    public int getProductId() {
        return getProductId();
    }
}
