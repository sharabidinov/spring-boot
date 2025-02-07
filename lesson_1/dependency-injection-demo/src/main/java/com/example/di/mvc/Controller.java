package com.example.di.mvc;

import org.springframework.stereotype.Component;

@Component
public class Controller {
    private final Model model;

    public Controller(Model model) {
        this.model = model;
        System.out.println(this);
    }
}
