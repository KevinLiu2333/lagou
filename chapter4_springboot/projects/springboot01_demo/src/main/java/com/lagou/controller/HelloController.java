package com.lagou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/9/24
 * Time: 21:50
 *
 * @author liuku
 */
@RestController
public class HelloController {

    @RequestMapping("/demo")
    public String demo() {
        return "你好,springboot";
    }
}
