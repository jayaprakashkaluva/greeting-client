package com.jp.docker;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/greet")
    public String greet(@RequestParam final String name) {
    return "Hello "+name;
    }
}
