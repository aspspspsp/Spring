package com.zihan.demo.dao.mappers;

import com.zihan.demo.model.Comment;

/**
 * Created by zihanxu on 2017/9/20.
 */
public interface CommentMapper {
    Comment getCommentById(long id);
    Comment getCommentByUid(long uid);
}
