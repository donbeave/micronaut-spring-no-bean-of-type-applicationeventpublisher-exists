package com.example.demo;

import io.micronaut.context.ApplicationContext;
import io.micronaut.spring.context.MicronautApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        var builder = new SpringApplicationBuilder();
        var micronautContext = new MicronautApplicationContext(ApplicationContext.builder());
        micronautContext.start();

        builder.parent(micronautContext);
        builder.sources(DemoApplication.class);
        builder.build().run(args);
    }

}
