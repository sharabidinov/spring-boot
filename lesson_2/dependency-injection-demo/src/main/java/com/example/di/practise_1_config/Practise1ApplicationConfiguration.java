package com.example.di.practise_1_config;

import com.example.di.practise_1.B;
import com.example.di.practise_1.T;
import com.example.di.practise_1.X;
import com.example.di.practise_1.Y;
import com.example.di.practise_1.Z;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class Practise1ApplicationConfiguration {
    @Bean
    public X getX() {
        return new X();
    }

    @Bean
    public Y getY(X x, Z z) {
        return new Y(x, z);
    }

    @Bean
    public Z getZ(X x, @Lazy T t) {
        return new Z(x, t);
    }

    @Bean
    public T getT(Z z, Y y) {
        return new T(z, y);
    }

    @Bean
    public B getB(X x, Z z) {
        return new B(x, z);
    }
}
