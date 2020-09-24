package com.lagou.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/9/24
 * Time: 22:48
 *
 * @author liuku
 */
@EnableConfigurationProperties
@Configuration
public class MyConfig {

    @Bean
    public MyService myService() {
        return new MyService();
    }
}
