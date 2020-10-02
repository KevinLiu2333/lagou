package com.lagou.controller;

import com.lagou.pojo.Article;
import com.lagou.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/10/2
 * Time: 8:07
 *
 * @author liuku
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/list")
    public String selectArticleList(Model model,
                                    @RequestParam(name = "pageNum", required = false, defaultValue = "0") Integer pageNum,
                                    @RequestParam(name = "pageSize", required = false, defaultValue = "3") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNum, pageSize);
        Page<Article> page = articleService.findAll(pageRequest);
        model.addAttribute("page", page);
        return "client/index";
    }
}
