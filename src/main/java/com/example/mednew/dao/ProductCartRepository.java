package com.example.mednew.dao;

import com.example.mednew.models.ProductCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCartRepository extends JpaRepository <ProductCart, Long> {
    List<ProductCart> findAllByCart_User_Id (Long userid);
}
