package com.example.mednew.controllers;

import com.example.mednew.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//public class ProductCartRestController {
//
//
//        private final UserService userService;
//        private final ProductCartService;
//
//        public CartRestController(UserService userService, CartService cartService) {
//            this.userService = userService;
//            this.cartService = cartService;
//        }
//
//        @PostMapping("/addProductToCart")
//        public ResponseEntity<CartDto> createToCart(@RequestBody CartDto cartDto) {
//            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//            User user = userService.getUserByEmail(auth.getName());
//            cartDto.setUserID(user.getId());
//            cartService.create(cartDto);
//            return new ResponseEntity<>(cartDto, HttpStatus.OK);
//        }
//
//
//        @DeleteMapping("/delete")
//        public ResponseEntity<Void> deleteFromCart(@RequestBody CartDto cartDto) {
//            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//            User user = userService.getUserByEmail(auth.getName());
//            cartDto.setUserID(user.getId());
//            cartService.delete(cartDto.getProductID(), user.getId());
//            return new ResponseEntity<>(HttpStatus.OK);
//        }
//
//
//        @PostMapping("/addGoodToCart")
//        public ResponseEntity<Void> addGoodToCart(@RequestBody CartDto cartDto) { // productID
//            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//            User user = userService.getUserByEmail(auth.getName());
//            cartDto.setUserID(user.getId());
//            cartService.addGoodToCart(cartDto);
//            return new ResponseEntity<>(HttpStatus.OK);
//        }
//}
