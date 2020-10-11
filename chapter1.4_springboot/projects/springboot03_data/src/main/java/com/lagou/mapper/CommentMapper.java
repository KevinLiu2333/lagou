package com.lagou.mapper;

import com.lagou.pojo.Comment;
import org.apache.ibatis.annotations.Select;

/**
 * @author kevliu3
 * 标识接口是mybatis接口文件 Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/28
 * Time: 5:45 AM
 */
public interface CommentMapper {
    /**
     * find by id
     *
     * @param id id
     * @return comment
     */
    @Select("select * from t_comment where id = #{id}")
    Comment findById(Integer id);
}
