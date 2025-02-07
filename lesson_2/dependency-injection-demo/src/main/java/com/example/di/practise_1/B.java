package com.example.di.practise_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    @Autowired
    private X x;
    @Autowired
    private Z z;

    public B() {
        System.out.println(this);
    }
}
