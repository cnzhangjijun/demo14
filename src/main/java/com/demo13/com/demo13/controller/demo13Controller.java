package com.demo13.com.demo13.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo13")
public class demo13Controller {

    @GetMapping
    public String demo13(){
        return "demo13 is done";
    }
}
