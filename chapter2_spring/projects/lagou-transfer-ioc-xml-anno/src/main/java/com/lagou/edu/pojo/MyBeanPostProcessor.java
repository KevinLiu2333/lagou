package com.lagou.edu.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * 和aop有关
 * <p>
 * User: kevliu3
 * Date: 2020/9/8
 * Time: 10:10 PM
 *
 * @author kevliu3
 */
@Component
@Configuration
public class MyBeanPostProcessor implements BeanPostProcessor {

    //拦截实例化之后的对象
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("lazyResult".equalsIgnoreCase(beanName)) {
            System.out.println("MyBeanPostProcessor before方法拦截处理lazyResult");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("lazyResult".equalsIgnoreCase(beanName)) {
            System.out.println("MyBeanPostProcessor after方法拦截处理lazyResult");
        }
        return bean;
    }
}
