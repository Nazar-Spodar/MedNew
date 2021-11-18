package com.example.mednew.services;

import com.example.mednew.dto.UserDto;
import com.example.mednew.models.User;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto user);

    List<UserDto> getAllUsers();

    User getUserByEmail(String email);

    List<UserDto> getAllusers();
}
