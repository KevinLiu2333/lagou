package com.lagou.service;

import com.lagou.pojo.Comment;
import com.lagou.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/9/30
 * Time: 23:26
 *
 * @author liuku
 */
@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    /**
     * 默认使用id为key
     * 如果为null不缓存
     *
     * @param id id
     * @return comment
     */
    @Cacheable(cacheNames = "comment", unless = "#result==null")
    public Comment findCommentById(Integer id) {
        Optional<Comment> comment = commentRepository.findById(id);
        return comment.orElse(null);
    }

    /**
     * 更新方法
     *
     * @param comment
     * @return
     */
    @CachePut(cacheNames = "comment", key = "#result.id")
    public Comment updateComment(Comment comment) {
        commentRepository.updateComment(comment.getAuthor(), comment.getId());
        //修改后返回
        return comment;
    }

    /**
     * 使缓存失效
     *
     * @param id id
     */
    @CacheEvict(cacheNames = "comment")
    public void deleteComment(Integer id) {
        commentRepository.deleteById(id);
    }

}
