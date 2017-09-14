package com.zihan.demo.services;

import com.zihan.demo.dao.VideoDAO;
import com.zihan.demo.model.User;
import com.zihan.demo.response.Resp;
import com.zihan.demo.utils.JsonUtil;
import com.zihan.demo.utils.RespUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zihanxu on 2017/9/14.
 */
@Service
public class VideoService {

    @Autowired
    private VideoDAO videoDAO;

    public Resp addVideo(HttpServletRequest request) {
        User user = (User) JsonUtil.parseJson(json);
        Resp<User> test = new Resp<>();
        test.setData(user);

        return RespUtil.ok(test);
    }

    public Resp getVideo() {
        return RespUtil.ok();
    }

    public Resp modifyVideo() {
        return RespUtil.ok();
    }
}
