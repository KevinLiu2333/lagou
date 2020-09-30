package com.lagou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/9/30
 * Time: 18:40
 *
 * @author liuku
 */
@Configuration
public class MyLocaleResolver implements LocaleResolver {

    /**
     * 自定义 区域解析方式
     */
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        //获取页面手动传递的参数
        String l = httpServletRequest.getParameter("l");
        Locale locale = null;
        if (!StringUtils.isEmpty(l)) {
            String[] s = l.split("_");
            locale = new Locale(s[0], s[1]);
        } else {
            String header = httpServletRequest.getHeader("Accept-Language");
            String[] split = header.split(",");
            String[] split1 = split[0].split("-");
            locale = new Locale(split1[0], split1[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }

    @Bean
    public LocaleResolver localResolver() {
        return new MyLocaleResolver();
    }
}
