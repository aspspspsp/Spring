package com.zihan.demo.services;

import com.zihan.demo.dao.UserDAO;
import com.zihan.demo.model.User;
import com.zihan.demo.response.Resp;
import com.zihan.demo.utils.JsonUtil;
import com.zihan.demo.utils.RespUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zihanxu on 2017/8/18.
 */
@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping("addUser")
    public Resp addUser(HttpServletRequest request) {
        User user = (User) JsonUtil.parseJson(json);
        Resp<User> test = new Resp<>();
        test.setData(user);

        return RespUtil.ok(test);
    }

    @RequestMapping("getUser")
    public Resp getUser() {
        return RespUtil.ok();
    }

    @RequestMapping("modifyUser")
    public Resp modifyUser() {
        return RespUtil.ok();
    }
}
