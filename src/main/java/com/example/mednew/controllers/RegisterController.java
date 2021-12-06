package com.example.mednew.controllers;

import com.example.mednew.dto.UserDto;
import com.example.mednew.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class RegisterController {
    private final UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String homePage(Model model) {
        return "register";
    }

    @PostMapping("/register")
    public String register(@RequestBody UserDto user, Model model) {
        System.out.println(user.toString());
        UserDto userDto = userService.saveUser(user);
        model.addAttribute("user", userDto);
        return "redirect:/home";
    }
}
