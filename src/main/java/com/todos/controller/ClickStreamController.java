package com.todos.controller;

import com.todos.model.EventData;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("http://localhost:3000")
@RestController
public class ClickStreamController {
    @RequestMapping(value = "/api/version/",method = RequestMethod.POST)
    public void logEventDetails(@RequestBody EventData eventData){
        System.out.println(eventData);
    }
}
