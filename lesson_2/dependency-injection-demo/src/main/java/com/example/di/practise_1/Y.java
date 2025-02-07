package com.example.di.practise_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Y {
    @Autowired
    private X x;
    @Autowired
    private Z z;

    public Y() {
        System.out.println(this);
    }
}
