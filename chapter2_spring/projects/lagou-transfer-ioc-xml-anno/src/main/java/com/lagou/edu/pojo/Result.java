package com.lagou.edu.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author 应癫
 */
//延迟加载
//@Lazy
public class Result implements BeanFactoryAware, BeanNameAware, ApplicationContextAware, InitializingBean {

    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("管理我的beanfactory为: " + beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("注册我成为bean时的id: " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("高级容器接口: " + applicationContext);
    }

    public void initMethod() {
        System.out.println("init-method......");
    }

    //    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet...");
    }
}
