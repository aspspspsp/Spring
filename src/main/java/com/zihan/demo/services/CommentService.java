package com.zihan.demo.services;

import com.zihan.demo.dao.CommentDAO;
import com.zihan.demo.model.Comment;
import com.zihan.demo.response.Resp;
import com.zihan.demo.utils.CodeEnum;
import com.zihan.demo.utils.RespUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zihanxu on 2017/9/14.
 */
@Service
public class CommentService {
    @Autowired
    private CommentDAO commentDAO;

    public Resp<Comment> getCommentById(Long commentId) {
        Resp<Comment> resp = new Resp<>();

        //當參數不合法時
        if(commentId <= 0)
            return RespUtil.fail(CodeEnum.PARAM_ILLEGAL.getCode(), "id參數非法");

        //取得Comment
        Comment comment = commentDAO.getCommentById(commentId);

        //當comment為空，表示id不合法，返回錯誤
        if(comment == null)
            return RespUtil.fail(CodeEnum.DATA_NULL.getCode(), "此評論並不存在");

        resp.setData(comment);
        return RespUtil.ok(comment);
    }

    public Resp<Comment> getCommentsByVideoId(Long videoId) {

    }

    public Resp<Comment> getCommentsByUserId(Long userId) {
        Resp<Comment> resp = new Resp<>();

        //當參數不合法時
        if(userId <= 0)
            return RespUtil.fail(CodeEnum.PARAM_ILLEGAL.getCode(), "id參數非法");

        //取得多Comment
        List<Comment> comments = commentDAO.getCommentsByUserId(userId);

        if(comments == null || comments.size() == 0)
            return RespUtil.fail(CodeEnum.DATA_NULL.getCode(), "在該使用者");

    }
}
