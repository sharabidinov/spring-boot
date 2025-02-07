package com.example.di.practise_2;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Model {
    private final Viewer viewer;

    public Model(@Lazy Viewer viewer) {
        this.viewer = viewer;
        System.out.println(this);
    }
}
