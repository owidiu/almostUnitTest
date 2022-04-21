package com.example.unitTestDemo.cart;

import com.example.unitTestDemo.order.OrderRepository;
import com.example.unitTestDemo.product.Product;
import com.example.unitTestDemo.product.ProductRepository;
import com.example.unitTestDemo.user.UserRepository;
import com.example.unitTestDemo.wishlist.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    WishlistRepository wishlistRepository;

    public CartService(CartRepository cartRepository, ProductRepository productRepository, UserRepository userRepository, WishlistRepository wishlistRepository) {
    }

    public void addProductToCart(Integer userId, Product product) {
        Cart cart = cartRepository.findByUserId(userId);
        if (cart == null) {
            cart = new Cart();
            cart.setUserId(userId);
            cart.setProducts(product);
            cartRepository.save(cart);
        } else {
            cart.getProducts().add(product);
            cartRepository.save(cart);
        }
    }

    public void removeProductFromCart(Integer userId, Product product) {
        Cart cart = cartRepository.findByUserId(userId);
        if (cart != null) {
            cart.getProducts().remove(product);
            cartRepository.save(cart);
        }
    }

    public void removeAllProductsFromCart(Integer userId) {
        Cart cart = cartRepository.findByUserId(userId);
        if (cart != null) {
            cart.getProducts().clear();
            cartRepository.save(cart);
        }
    }

    public List<Product> getProductsInCart(Integer userId) {
        return cartRepository.findByUserId(userId).getProducts();
    }
}
