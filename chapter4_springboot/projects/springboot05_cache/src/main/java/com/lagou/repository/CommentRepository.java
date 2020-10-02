package com.lagou.repository;

import com.lagou.pojo.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/9/30
 * Time: 23:17
 *
 * @author liuku
 */

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    //根据评论id修改评论作者
    //update操作
    @Transactional
    @Modifying
    @Query("update Comment c set c.author=?1 where c.id=?2")
    int updateComment(String author, Integer id);

}
