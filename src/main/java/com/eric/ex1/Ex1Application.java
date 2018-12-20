package com.eric.ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"services","models","com.eric.ex1"})
@SpringBootApplication
public class Ex1Application {

    public static void main(String[] args) {

        SpringApplication.run(Ex1Application.class, args);
    }

}

