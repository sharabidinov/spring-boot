package com.example.di.practise_1;

public class B {
    private final X x;
    private final Z z;

    public B(X x, Z z) {
        this.x = x;
        this.z = z;
        System.out.println(this);
    }
}
