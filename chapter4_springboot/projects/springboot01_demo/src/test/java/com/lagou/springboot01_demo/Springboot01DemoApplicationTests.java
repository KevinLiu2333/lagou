package com.lagou.springboot01_demo;

import com.lagou.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * RunWith---测试启动器,并加载spring boot测试注解
 * SpringBootTest---标记为springboot单元测试类,并加载项目的applicationContext上下文环境
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot01DemoApplicationTests {

    @Autowired
    private HelloController helloController;

    @Test
    void contextLoads() {
        String demo = helloController.demo();
        System.out.println(demo);
    }

}
