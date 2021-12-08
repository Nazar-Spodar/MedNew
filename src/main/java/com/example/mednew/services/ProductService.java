package com.example.mednew.services;

import com.example.mednew.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto saveProduct(ProductDto productDto);

    List<ProductDto> allProducts();

    ProductDto getById(Long id);

    void delete(Long id);
}
