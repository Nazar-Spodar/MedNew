package com.example.mednew.services;

import com.example.mednew.dao.CartRepository;
import com.example.mednew.dao.UserRepository;
import com.example.mednew.dto.UserDto;

import java.util.List;

public class CartServiceImpl implements CartService{
    private final CartRepository cartRepository;
    private final UserRepository userRepository;

    public CartServiceImpl(CartRepository cartRepository, UserRepository userRepository) {
        this.cartRepository = cartRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> findByUser(Long user_id) {
        return cartRepository.findAllByUser_Id(user_id);
    }
}
