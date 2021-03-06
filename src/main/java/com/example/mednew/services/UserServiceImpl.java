package com.example.mednew.services;

import com.example.mednew.dao.UserRepository;
import com.example.mednew.dto.UserDto;
import com.example.mednew.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    private final UserRepository userRepository;


    @Override
    public UserDto saveUser(UserDto userDto) {

        if (Objects.isNull(userDto)) {
            throw new RuntimeException("user cant be null");
        }
        if (userDto.getAge() < 21) {
            throw new RuntimeException("user is not adult");
        }
            User user = fromDto(userDto);
        user.setPassword(passwordEncoder().encode(userDto.getPassword()));
        user = userRepository.save(user);

        return toDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> all = userRepository.findAll();
        return all.stream().map(this::toDto).collect(Collectors.toList());
    }

    @Override
    public User getUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        return user;
    }

    @Override
    public List<UserDto> getAllusers() {
        return null;
    }

    private User fromDto(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
//        user.setAdult(userDto.getAdult());
        user.setEmail(userDto.getEmail());
        return user;
    }

    private UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
//        userDto.setAdult(user.getAdult());
        return userDto;
    }
}
