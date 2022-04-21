package com.example.unitTestDemo.product;

import com.example.unitTestDemo.cart.Cart;
import com.example.unitTestDemo.order.Order;
import com.example.unitTestDemo.wishlist.Wishlist;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private double price;
    private Integer quantity;

    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Wishlist wishlist;

    @ManyToOne
    private Order order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


}
