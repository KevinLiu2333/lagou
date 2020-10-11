package com.lagou.config;

import com.lagou.pojo.SimpleBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 类路径下有指定的类的情况,就会进行自动配置
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/27
 * Time: 7:58 PM
 *
 * @author kevliu3
 */
@Configuration
@ConditionalOnClass
public class MyAutoConfiguration {

    static {
        System.out.println("MyAutoConfiguration init...");
    }

    @Bean
    public SimpleBean simpleBean() {
        return new SimpleBean();
    }

}
