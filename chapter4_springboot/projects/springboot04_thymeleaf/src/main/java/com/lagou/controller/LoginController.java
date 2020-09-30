package com.lagou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/9/30
 * Time: 17:49
 *
 * @author liuku
 */
@Controller
public class LoginController {

    @RequestMapping("/toLoginPage")
    public String toLoginPage(Model model) {
        model.addAttribute("currentYear", Calendar.getInstance().get(Calendar.YEAR));
        return "login";
    }
}
