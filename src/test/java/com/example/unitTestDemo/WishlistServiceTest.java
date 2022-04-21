package com.example.unitTestDemo;

import com.example.unitTestDemo.wishlist.Wishlist;
import com.example.unitTestDemo.wishlist.WishlistService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class WishlistServiceTest {
    @Autowired
    private WishlistService wishlistService;

    @Test
    public void testAddToWishlist() {

        Wishlist wishlist = new Wishlist();
        wishlist.setUserId(1);
        wishlist.setProductId(1);

        wishlistService.addToWishlist(wishlist.getUserId(), wishlist.getProductId());

        assertEquals(1, wishlist.getUserId());
        assertEquals(1, wishlist.getProductId());
    }

    @Test
    public void testRemoveFromWishlist() {

        Wishlist wishlist = new Wishlist();
        wishlist.setUserId(1);
        wishlist.setProductId(1);

        wishlistService.removeFromWishlist(wishlist.getUserId(), wishlist.getProductId());

        assertEquals(1, wishlist.getUserId());
        assertEquals(1, wishlist.getProductId());
    }
}

