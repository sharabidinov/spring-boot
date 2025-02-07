package com.example.di.config;

import com.example.di.mvc.Controller;
import com.example.di.mvc.Model;
import com.example.di.mvc.Viewer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class ApplicationConfiguration {
    public ApplicationConfiguration() {
        System.out.println(this);
    }

    @Bean
    public Viewer getViewer(Controller controller) {
        return new Viewer(controller);
    }

    @Bean
    public Controller getController(Model model) {
        return new Controller(model);
    }

    @Bean
    public Model getModel(@Lazy Viewer viewer) {
        return new Model(viewer);
    }
}
