package com.example.di.practise_2;

import org.springframework.stereotype.Component;

@Component
public class Viewer {
    private final Controller controller;
    private final Canvas canvas;

    public Viewer(Controller controller, Canvas canvas) {
        this.controller = controller;
        this.canvas = canvas;
        System.out.println(this);
    }
}
