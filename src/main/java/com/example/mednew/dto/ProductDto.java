package com.example.mednew.dto;

import lombok.AllArgsConstructor;
import org.mapstruct.Mappings;

//@Mappings(source = "Product", target = "ProductDto")
@AllArgsConstructor
public class ProductDto {
    private Long id;
    private String name;
    private Double price;
    private String about;


    public ProductDto() {

    }
}
