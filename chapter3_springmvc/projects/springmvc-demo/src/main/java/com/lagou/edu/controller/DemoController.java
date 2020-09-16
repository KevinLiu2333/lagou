package com.lagou.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/15
 * Time: 6:12 PM
 *
 * @author kevliu3
 */
@Controller
@RequestMapping("/demo")
public class DemoController {


    @RequestMapping("/handle01")
    public ModelAndView handle01() {
        //服务器时间
        Date date = new Date();
        //返回服务器时间到前端页面
        //封装了数据和页面信息的模型
        ModelAndView modelAndView = new ModelAndView();
        //向请求域中放入属性值
        modelAndView.addObject("date", date);
        //视图信息(封装跳转页面信息)
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/handle11")
    public String handle11(ModelMap modelMap) {
        //服务器时间
        Date date = new Date();
        //返回服务器时间到前端页面1
        //封装了数据和页面信息的模型
//        ModelAndView modelAndView = new ModelAndView();
        //向请求域中放入属性值
        modelMap.addAttribute("date", date);
        //视图信息(封装跳转页面信息)
//        modelAndView.setViewName("success");
        return "success";
    }
}
