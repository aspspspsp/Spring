package com.zihan.demo.controllers;

import com.zihan.demo.model.User;
import com.zihan.demo.response.Resp;
import com.zihan.demo.services.UserService;
import com.zihan.demo.utils.RespUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zihanxu on 2017/8/18.
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * 新增使用者
     * @param user 使用者資訊
    */
    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public Resp addUser(@RequestBody User user) {
        if(user == null)
            return RespUtil.fail(100, "oh fuck");
        logger.info("adduser");

        return RespUtil.ok(user);
    }

    /**
     * 讀取使用者
     * @param uid
     * @return
     */
    @RequestMapping(value = "getUser")
    public Resp getUser(@RequestParam long uid) {
        return userService.getUser(uid);
    }


    public void moidifyUser() {

    }

    /**
     * 驗證使用者E-Mail
     */
    public void verifyUser() {

    }

    @RequestMapping(value = "fuck")
    public Resp getFuck() {
        return RespUtil.ok("hello");
    }
}
