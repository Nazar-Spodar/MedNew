package com.example.mednew.services;

import com.example.mednew.dto.UserDto;

import java.util.List;

public interface CartService {
    List<UserDto> findByUser(Long user_id);
}
