package ru.netology.springbootauthorization.controller;

import ru.netology.springbootauthorization.service.AuthorizationService;
import ru.netology.springbootauthorization.users.User;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AuthorizationController {
    AuthorizationService service;

    @GetMapping("/authorize")
    public ResponseEntity<List<Authorities>> getAuthorities(@Valid User user) {
        List<Authorities> authorities = service.getAuthorities(user);
        return ResponseEntity.ok(authorities);
    }
}
