package com.quangviet.ecommercespringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CheckhealthController {
    @GetMapping
    public String checkhealth() {
        return "Server is live";
    }
}
