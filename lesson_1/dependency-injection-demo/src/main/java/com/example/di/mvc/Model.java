package com.example.di.mvc;

import org.springframework.stereotype.Component;

@Component
public class Model {
    private final Viewer viewer;

    public Model(Viewer viewer) {
        this.viewer = viewer;
        System.out.println(this);
    }
}
