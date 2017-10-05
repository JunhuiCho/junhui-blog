package com.junhui00.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Booter extends SpringBootServletInitializer{
    public static void main(String[] args){
        SpringApplication.run(Booter.class, args);
    }
}
