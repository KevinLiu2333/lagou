package com.lagou.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/9/22
 * Time: 22:01
 *
 * @author liuku
 */
@Controller
public class ResumeController {

    @RequestMapping("/test")
    public void test() {
        System.out.println(123);
    }

}
