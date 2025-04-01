package com.example.calcioappbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CalcioAppBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalcioAppBeApplication.class, args);
    }

}
