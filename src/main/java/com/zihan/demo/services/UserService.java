package com.zihan.demo.services;

import com.zihan.demo.model.User;
import com.zihan.demo.response.Resp;
import com.zihan.demo.utils.CodeEnum;
import com.zihan.demo.utils.JsonUtil;
import com.zihan.demo.utils.RespUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.rmi.CORBA.Util;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zihanxu on 2017/8/18.
 */
@Service
public class UserService {

//    @Autowired
//    private UserDAO userDAO;

    public Resp addUser(@RequestBody User user) {
        Resp<User> test = new Resp<>();
        test.setData(user);

        return RespUtil.ok(test);
    }

    /**
     * 取得使用者
     * @param uid
     * @return
     */
    public Resp getUser(long uid) {
        if(uid < 0) {
            return RespUtil.fail(CodeEnum.OPERATE_ERROR.getCode(), "參數錯誤");
        }

        return RespUtil.ok("成功惹");
    }

    public Resp modifyUser() {
//        return RespUtil.ok();
        return null;
    }
}
