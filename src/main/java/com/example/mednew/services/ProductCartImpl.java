package com.example.mednew.services;

import com.example.mednew.dao.ProductCartRepository;
import com.example.mednew.dao.ProductRepository;
import com.example.mednew.dao.UserRepository;
import com.example.mednew.dto.ProductCartDto;
import com.example.mednew.models.Cart;
import com.example.mednew.models.Product;
import com.example.mednew.models.User;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ProductCartImpl implements ProductCart {
    private final ProductCartRepository productCartRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public ProductCartImpl(ProductCartRepository productCartRepository, UserRepository userRepository, ProductRepository productRepository) {
        this.productCartRepository = productCartRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

//    @Override
//    public ProductCartDto create(ProductCartDto productCartDto) {
//        ProductCart productCart = new ProductCart();
//        Product product = new Product();
//        Cart cart = new Cart();
//
//
//    }
//    @Override
//    public CartDto create(CartDto cartDto) {
//        Cart cart = new Cart();
//        User user = userRepository.getById(cartDto.getUserID());
//        Product product = productRepository.getById(cartDto.getProductID());
//        Cart productIdAndUserId = cartRepository.findByProduct_IdAndUser_Id(product.getId(), user.getId());
//        if (Objects.nonNull(productIdAndUserId)) {
//            return addGoodToCart(cartDto);
//        } else {
//            return createCart(cartDto, cart, user, product);
//        }
}
