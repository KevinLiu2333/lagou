package com.lagou.pojo;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/28
 * Time: 5:40 AM
 *
 * @author kevliu3
 */
@Entity(name = "t_comment")
public class Comment {

    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String comment;
    private String author;
    @Column(name = "a_id")
    private Integer aId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", author='" + author + '\'' +
                ", aId=" + aId +
                '}';
    }
}
