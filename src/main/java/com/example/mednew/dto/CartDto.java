package com.example.mednew.dto;

import com.example.mednew.models.User;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CartDto {
    private Long id;
    private User user;
}
