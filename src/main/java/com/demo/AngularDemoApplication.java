package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demo.mapper")
public class AngularDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AngularDemoApplication.class,args);
    }
}
