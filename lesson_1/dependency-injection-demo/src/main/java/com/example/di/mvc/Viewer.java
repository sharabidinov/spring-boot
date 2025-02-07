package com.example.di.mvc;

import org.springframework.stereotype.Component;

@Component
public class Viewer {
    private final Controller controller;

    public Viewer(Controller controller) {
        this.controller = controller;
        System.out.println(this);
    }
}
