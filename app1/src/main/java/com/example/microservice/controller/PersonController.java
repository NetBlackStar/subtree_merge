package com.example.microservice.controller;


import dto.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mahdi Mohammadi, 5/26/2023 9:08 PM
 */
@RestController
public class PersonController {

    @GetMapping("get-service1")
    public Person getPerson() {
        Person person = new Person();
        person.setName("app1");
        person.setFamily("main");
        return person;
    }

}

