package com.example.di.practise_1;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Z {
    private final X x;
    private final T t;

    public Z(X x, @Lazy T t) {
        this.x = x;
        this.t = t;
        System.out.println(this);
    }
}
