package com.example.unitTestDemo.wishlist;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WishlistController {
    private final WishlistService wishlistService;

    public void addWishlist(Integer userId, Integer productId) {
        wishlistService.addToWishlist(userId, productId);
    }

    public void removeWishlist(Integer userId, Integer productId) {
        wishlistService.removeFromWishlist(userId, productId);
    }
}
