package com.lagou.repository;


import com.lagou.pojo.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/28
 * Time: 6:13 AM
 *
 * @author kevliu3
 */

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
