package com.devops.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class App {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }

    @GetMapping("/")
    public String home() {
        int n = 19;
        return "<h1>Factorial of " + n + " is: " + factorial(n) + "</h1>";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}