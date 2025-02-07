package com.example.di.practise_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class T {
    @Autowired
    private Z z;
    @Autowired
    private Y y;

    public T() {
        System.out.println(this);
    }
}
