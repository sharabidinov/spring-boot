package com.example.di.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Controller {
    @Autowired
    private Model model;

    public Controller() {
        System.out.println(this);
    }
}
