package com.example.mednew.dto;

import com.example.mednew.models.Cart;
import com.example.mednew.models.Product;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ProductCartDto {

    private Long id;
    private Product product;
    private Cart cart;
    private Long productAmount;
    private Double actualPrice;
}
