package com.lagou.edu.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

// 可以让我们优雅的捕获所有Controller对象handler方法抛出的异常
@ControllerAdvice
public class GlobalExceptionResolver {
//    @ExceptionHandler(ArithmeticException.class)
//    public void hanldleException(ArithmeticException e, HttpServletResponse response) {
//        //异常处理逻辑
//        try {
//            response.getWriter().write("===>" + e.getMessage());
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        }
//    }
    //可以返回modelandview
    @ExceptionHandler(ArithmeticException.class)
    public ModelAndView handleException(ArithmeticException exception, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",exception.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
