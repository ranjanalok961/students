package com.alok.students.Controller;

import com.alok.students.Model.User;
import com.alok.students.Service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // Register
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return authService.register(user);
    }

    // Login
    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password) {

        return authService.login(email, password);
    }
}