package com.example.mednew.dao;

import com.example.mednew.dto.UserDto;
import com.example.mednew.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    List<UserDto> findAllByUser_Id(Long userId);
}
