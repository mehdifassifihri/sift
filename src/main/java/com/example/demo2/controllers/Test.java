package com.example.demo2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/")
public class Test {
    @GetMapping()
    String getText(){
        return "weuinc";
    }
}
