package com.larry.springbootstudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.larry.springbootstudy.dao")
@SpringBootApplication
public class SpringbootstudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootstudyApplication.class, args);
    }

}
