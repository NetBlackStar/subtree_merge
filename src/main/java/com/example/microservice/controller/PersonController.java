package com.example.microservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mahdi Mohammadi, 5/26/2023 9:08 PM
 */
@RestController
public class PersonController {

    @GetMapping("get-service1")
    public Person getPerson() {
        System.out.println("service1");

    }

}

