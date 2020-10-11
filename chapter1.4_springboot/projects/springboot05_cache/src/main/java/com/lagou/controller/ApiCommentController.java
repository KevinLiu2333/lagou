package com.lagou.controller;

import com.lagou.pojo.Comment;
import com.lagou.service.ApiCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: liuku
 * Date: 2020/9/30
 * Time: 23:29
 *
 * @author liuku
 */
@RestController
@RequestMapping("api")
public class ApiCommentController {

    @Autowired
    private ApiCommentService commentService;

    @RequestMapping("/findCommentById")
    private Comment findCommentById(Integer id) {
        return commentService.findCommentById(id);
    }

    /**
     * 更新方法
     *
     * @param comment comment
     * @return comment
     */
    @RequestMapping("/updateComment")
    public Comment updateComment(Comment comment) {
        Comment commentById = commentService.findCommentById(comment.getId());
        commentById.setAuthor(comment.getAuthor());
        return commentService.updateComment(commentById);
    }

    @RequestMapping("/deleteComment")
    public void deleteComment(Integer id) {
        commentService.deleteComment(id);
    }

}
