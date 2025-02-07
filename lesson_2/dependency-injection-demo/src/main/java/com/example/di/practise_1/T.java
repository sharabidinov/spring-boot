package com.example.di.practise_1;

import org.springframework.stereotype.Component;

@Component
public class T {
    private final Z z;
    private final Y y;

    public T(Z z, Y y) {
        this.z = z;
        this.y = y;
        System.out.println(this);
    }
}
