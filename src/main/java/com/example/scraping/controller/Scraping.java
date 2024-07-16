package com.example.scraping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class Scraping {
    @GetMapping("/hello")
    public String test()
    {
        return "Hello";
    }
}
