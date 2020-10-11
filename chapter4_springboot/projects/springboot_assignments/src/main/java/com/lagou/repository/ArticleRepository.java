package com.lagou.repository;

import com.lagou.pojo.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/10/2
 * Time: 8:02
 *
 * @author liuku
 */
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
