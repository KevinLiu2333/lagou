package com.lagou.service.impl;

import com.lagou.pojo.Article;
import com.lagou.repository.ArticleRepository;
import com.lagou.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/10/2
 * Time: 8:23
 *
 * @author liuku
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    @Cacheable(cacheNames = "article", unless = "#result==null")
    public Page<Article> findAll(Pageable pageable) {
        return articleRepository.findAll(pageable);
    }
}
