package com.lagou.service;

import com.lagou.pojo.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/10/2
 * Time: 8:15
 *
 * @author liuku
 */
public interface ArticleService {
    /**
     * pageable article
     *
     * @param pageable page info
     * @return article
     */
    Page<Article> findAll(Pageable pageable);
}
