package com.example.unitTestDemo.user;

import com.example.unitTestDemo.cart.Cart;
import com.example.unitTestDemo.order.Order;
import com.example.unitTestDemo.wishlist.Wishlist;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String username;

    @OneToOne
    private Cart cart;

    @OneToMany
    private List<Order> orders;

    @OneToOne
    private Wishlist wishlist;

    private void addOrder(Order order) {
        orders.add(order);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
