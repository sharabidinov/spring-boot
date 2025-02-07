package com.example.di.practise_2;

import org.springframework.stereotype.Component;

@Component
public class Canvas {
    private final Model model;

    public Canvas(Model model) {
        this.model = model;
        System.out.println(this);
    }
}
