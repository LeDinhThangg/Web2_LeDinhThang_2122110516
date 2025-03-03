package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }

    @PostMapping("/sum")
    public String sum(@RequestBody SumRequest request) {
        return "a=" + request.getA() + ", b=" + request.getB();
    }
}
