package com.lagou.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/27
 * Time: 7:53 PM
 *
 * @author kevliu3
 */
//开启下面的注解
@EnableConfigurationProperties(SimpleBean.class)
@ConfigurationProperties(prefix = "simpleBean")
public class SimpleBean {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
