package com.example.di.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
public class Model {
    @Autowired
    private @Lazy Viewer viewer;

    public Model() {
        System.out.println(this);
    }
}
