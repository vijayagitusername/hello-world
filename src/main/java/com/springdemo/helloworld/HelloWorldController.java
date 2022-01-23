package com.springdemo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String helloWorld() {
        return "Hello World from Spring Boot";
    }

    @RequestMapping("/goodbye")
    public String goodBye() {
        return "Good Bye from Spring Boot";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot";
    }
}
