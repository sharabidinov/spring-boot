package com.example.di.practise_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Z {
    @Autowired
    private X x;
    @Autowired
    private @Lazy T t;

    public Z() {
        System.out.println(this);
    }
}
