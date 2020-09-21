package com.lagou.demo.controller;

import com.lagou.demo.service.IDemoService;
import com.lagou.edu.annotations.LagouAutowired;
import com.lagou.edu.annotations.LagouController;
import com.lagou.edu.annotations.LagouRequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/9/18
 * Time: 21:58
 *
 * @author liuku
 */
@LagouController
@LagouRequestMapping("/demo")
public class DemoController {

    @LagouAutowired
    private IDemoService demoService;

    /**
     * URL:/demo/query
     * @param request
     * @param response
     * @param name
     * @return
     */
    @LagouRequestMapping("/query")
    public String query(HttpServletRequest request, HttpServletResponse response, String name) {
        return demoService.get(name);
    }
}
