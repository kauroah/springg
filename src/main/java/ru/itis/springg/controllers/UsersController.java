package ru.itis.springg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.springg.services.UsersService;

@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public String UsersPage(Model model) {
        model.addAttribute("UsersList", usersService.getAllUsers());
        return "users_page";
    }

}
