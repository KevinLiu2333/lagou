package com.lagou.edu.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 切面配置
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/10
 * Time: 8:36 AM
 *
 * @author kevliu3
 */
@Component
@Aspect
public class LogUtils {

    @Pointcut("execution(* com.lagou.edu.service.impl.TransferServiceImpl.*(..))")
    public void pt1() {
    }

    /**
     * 业务逻辑开始时执行
     */
    @Before("pt1()")
    public void beforeMethod(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
        System.out.println("业务逻辑开始执行之前......");
    }

    /**
     * 业务逻辑结束时执行(无论异常与否)
     */
    @After("pt1()")
    public void afterMethod() {
        System.out.println("业务逻辑结束执行之前......");
    }

    /**
     * 异常时执行
     */
    @AfterThrowing("pt1()")
    public void exceptionMethod() {
        System.out.println("异常时执行......");
    }

    /**
     * 业务逻辑正常时执行
     */
    @AfterReturning(value = "pt1()", returning = "retVal")
    public void succeedMethod(Object retVal) {
        System.out.println("业务正常时执行");
    }

    /**
     * 环绕通知
     */
//    @Around("pt1()")
    public Object arroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result = null;
        try {
            System.out.println("环绕通知中的before method");
            result = joinPoint.proceed();
        } catch (Exception e) {
            System.out.println("环绕通知中的exception method");
        } finally {
            System.out.println("环绕通知中的aftermethod");
        }
        return result;
    }
}
