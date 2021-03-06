package com.lagou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author liuku
 */
@EnableCaching
@SpringBootApplication
public class Springboot05CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot05CacheApplication.class, args);
    }

}
