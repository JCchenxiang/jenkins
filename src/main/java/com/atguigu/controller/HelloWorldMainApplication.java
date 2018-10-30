package com.atguigu.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class HelloWorldMainApplication {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){

        return application.sources(HelloWorldMainApplication.class);
    }

    public static void main(String[] args) {

        //Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
