package com.lagou.service;

import com.lagou.pojo.Comment;
import com.lagou.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/9/30
 * Time: 23:26
 *
 * @author liuku
 */
@Service
public class ApiCommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * api缓存
     *
     * @param id id
     * @return comment
     */
    public Comment findCommentById(Integer id) {
        Object o = redisTemplate.opsForValue().get("comment_" + id);
        if (o != null) {
            return (Comment) o;
        } else {

            Optional<Comment> byId = commentRepository.findById(id);
            if (byId.isPresent()) {
                Comment comment = byId.get();
                redisTemplate.opsForValue().set("comment_" + id, comment, 1, TimeUnit.DAYS);
                return comment;
            }
        }
        return null;
    }

    /**
     * 更新方法
     *
     * @param comment
     * @return
     */
    public Comment updateComment(Comment comment) {
        commentRepository.updateComment(comment.getAuthor(), comment.getId());
        redisTemplate.opsForValue().set("comment_" + comment.getId(), comment);
        return comment;
    }

    /**
     * 使缓存失效
     *
     * @param id id
     */
    public void deleteComment(Integer id) {
        commentRepository.deleteById(id);
        redisTemplate.delete("comment_" + id);
    }

}
