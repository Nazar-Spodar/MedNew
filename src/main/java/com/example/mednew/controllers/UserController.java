package com.example.mednew.controllers;

import com.example.mednew.dto.UserDto;
import com.example.mednew.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.authentication.UserServiceBeanDefinitionParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")

    public String getAllUser(Model model) {
        List<UserDto> allUsers = userService.getAllusers();
        model.addAttribute("users", allUsers);
        return "users";
}

}
