package com.example.mednew.dao;

import com.example.mednew.dto.ProductDto;
import com.example.mednew.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByName(String name);       // Варіант 1

    @Query("select p from Product p where p.name =:name")       // Варіант2
    List<Product> findCustom(@Param("name") String name);

    @Query(value = "select * from products where name =:name ", nativeQuery = true)     // Варіант3(найкращий)
    List<Product> findCustomNative(@Param("name") String name);
}
