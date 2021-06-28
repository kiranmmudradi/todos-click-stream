package com.todos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @RequestMapping("/")
    public String checkHealth(){
        return "200 OK";
    }
}
