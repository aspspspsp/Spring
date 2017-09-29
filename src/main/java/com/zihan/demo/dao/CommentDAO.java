package com.zihan.demo.dao;

import com.zihan.demo.dao.mappers.CommentMapper;
import com.zihan.demo.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zihanxu on 2017/9/14.
 */
@Repository
public class CommentDAO {
    @Autowired
    private CommentMapper commentMapper;
    public Comment getCommentById(Long commentId) {
        return null;
    }
    public List<Comment> getCommentsByUserId(Long userId) {
        return null;
    }
}
