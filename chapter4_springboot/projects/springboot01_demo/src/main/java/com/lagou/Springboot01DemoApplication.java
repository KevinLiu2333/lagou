package com.lagou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author liuku
 */
@PropertySource("classpath:test.properties")
@SpringBootApplication
public class Springboot01DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot01DemoApplication.class, args);
    }

}
