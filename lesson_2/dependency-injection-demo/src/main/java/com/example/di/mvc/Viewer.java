package com.example.di.mvc;

public class Viewer {
    private final Controller controller;

    public Viewer(Controller controller) {
        this.controller = controller;
        System.out.println(this);
    }
}
