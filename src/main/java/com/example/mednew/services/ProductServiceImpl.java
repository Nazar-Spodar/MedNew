package com.example.mednew.services;

import com.example.mednew.dao.ProductRepository;
import com.example.mednew.dto.ProductDto;
import com.example.mednew.models.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDto saveProduct(ProductDto productDto) {

        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        Product save = productRepository.save(product);
        BeanUtils.copyProperties(save, productDto);
        return productDto;
    }

    @Override
    public List<ProductDto> allProducts() {
        return productRepository.findAll().stream().map(product -> {
            ProductDto result = new ProductDto();
            BeanUtils.copyProperties(product, result);
            return result;
        }).collect(Collectors.toList());
    }

    @Override
    public ProductDto getById(Long id) {
        ProductDto productDto = new ProductDto();
        Product product = productRepository.getById(id);
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
