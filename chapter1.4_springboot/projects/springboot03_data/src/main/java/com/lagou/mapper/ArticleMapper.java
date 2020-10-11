package com.lagou.mapper;

import com.lagou.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/28
 * Time: 5:55 AM
 *
 * @author kevliu3
 */
public interface ArticleMapper {
    //根据id查询对应的文章
    Article selectArticle(Integer id);

}
