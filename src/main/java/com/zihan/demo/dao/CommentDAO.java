package com.zihan.demo.dao;

import com.zihan.demo.model.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zihanxu on 2017/9/14.
 */
@Repository
public interface CommentDAO {
    public Comment getCommentById(Long commentId);
    public List<Comment> getCommentsByUserId(Long userId);
}
