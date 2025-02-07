package com.example.di.mvc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Repository
//@Controller
//@Configuration
@Service
public class Erkin {
    public Erkin() {
        System.out.println(this);
    }
}
