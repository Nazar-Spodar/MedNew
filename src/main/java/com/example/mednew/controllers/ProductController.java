package com.example.mednew.controllers;

import com.example.mednew.dto.ProductDto;
import com.example.mednew.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/addProduct")
    public String homePage(Model model) {
        return "createProduct";
    }

    @GetMapping("/allProducts")
    public String allProducts(Model model) {
        List<ProductDto> productDtos = productService.allProducts();
        model.addAttribute("products", productDtos);
        return "products";
    }

    }
