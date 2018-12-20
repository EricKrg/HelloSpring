package com.eric.ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"services","models","com.eric.ex1"})
@SpringBootApplication
@EnableConfigurationProperties
public class Ex1Application {

    public static void main(String[] args) {

        ApplicationContext ctx= SpringApplication.run(Ex1Application.class, args);
        AppConfig myconfig = (AppConfig) ctx.getBean("appConfig");
        System.out.println(myconfig.toString());
    }

}

