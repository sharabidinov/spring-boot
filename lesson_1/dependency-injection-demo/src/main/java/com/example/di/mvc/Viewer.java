package com.example.di.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Viewer {
    @Autowired
    private com.example.di.mvc.Controller controller;
    public Viewer() {
        System.out.println(this);
    }
}
