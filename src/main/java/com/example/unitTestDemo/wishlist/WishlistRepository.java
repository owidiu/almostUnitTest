package com.example.unitTestDemo.wishlist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishlistRepository extends CrudRepository<Wishlist, Integer> {
    void addProductToWishlist(Long userId, Long productId);

    void deleteProductFromWishlist(Long userId, Long productId);

    void deleteByUserIdAndProductId(Integer userId, Integer productId);
}
