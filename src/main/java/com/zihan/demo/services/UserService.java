package com.zihan.demo.services;

import com.zihan.demo.dao.UserDAO;
import com.zihan.demo.model.User;
import com.zihan.demo.response.Resp;
import com.zihan.demo.utils.JsonUtil;
import com.zihan.demo.utils.RespUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zihanxu on 2017/8/18.
 */
@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public Resp addUser(HttpServletRequest request) {
        User user = (User) JsonUtil.parseJson(json);
        Resp<User> test = new Resp<>();
        test.setData(user);

        return RespUtil.ok(test);
    }

    public Resp getUser() {
        return RespUtil.ok();
    }

    public Resp modifyUser() {
        return RespUtil.ok();
    }
}
