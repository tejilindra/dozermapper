package com.demo.dozermapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class DozermapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(DozermapperApplication.class, args);
    }
}
