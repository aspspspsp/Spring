package com.zihan.demo.services;

import com.zihan.demo.model.User;
import com.zihan.demo.response.Resp;
import com.zihan.demo.utils.JsonUtil;
import com.zihan.demo.utils.RespUtil;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zihanxu on 2017/8/18.
 */
@Service
public class MemberService {
    public Resp addMember(HttpServletRequest request) {
        User member = (User) JsonUtil.parseJson(json);
        Resp<User> test = new Resp<>();
        test.setData(member);

        return RespUtil.ok(test);
    }

    public Resp getMember() {

    }

    public Resp modifyMember() {
        return RespUtil.ok();
    }




}
