package ru.itis.springg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.springg.dto.UserForm;
import ru.itis.springg.services.SignUpService;

@Controller
public class SignUpController {


    @Autowired
    private SignUpService signUpService;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "sign-up-page";
    }

    @PostMapping("/signUp")
    public String SignUp(UserForm form) {
        signUpService.addUser(form);
        return "redirect:/signUp";
    }

}
