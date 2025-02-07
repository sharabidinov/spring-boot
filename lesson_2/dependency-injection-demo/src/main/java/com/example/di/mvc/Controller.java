package com.example.di.mvc;


public class Controller {
    private final Model model;

    public Controller(Model model) {
        this.model = model;
        System.out.println(this);
    }
}
