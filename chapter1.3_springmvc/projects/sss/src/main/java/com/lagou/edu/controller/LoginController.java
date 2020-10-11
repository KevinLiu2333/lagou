package com.lagou.edu.controller;

import com.lagou.edu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/9/22
 * Time: 23:15
 *
 * @author liuku
 */
@Controller
public class LoginController {

    /**
     * 向用户登录页面跳转
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    /**
     * login
     *
     * @param user    user
     * @param model   model
     * @param session session
     * @return login result
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(User user, Model model, HttpSession session) {
        String username = user.getUsername();
        String password = user.getPassword();
        if ("admin".equals(username) && "admin".equals(password)) {
            session.setAttribute("USER_SESSION", user);
            return "redirect:list";
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录！");
        return "login";
    }
}
