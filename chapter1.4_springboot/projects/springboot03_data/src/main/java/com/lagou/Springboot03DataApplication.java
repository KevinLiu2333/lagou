package com.lagou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lagou.mapper")
public class Springboot03DataApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03DataApplication.class, args);
    }

}
