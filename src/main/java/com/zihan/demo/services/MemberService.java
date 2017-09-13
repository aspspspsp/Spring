package com.zihan.demo.services;

import com.zihan.demo.model.Member;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zihanxu on 2017/8/18.
 */
@Service
public class MemberService {
    public Object addMember(HttpServletRequest request) {
        request.
        Member member = (Member)parseJson(json);
        return ;
    }

    private Object parseJson(String json) {
        GsonBuilder gson = new GsonJsonParser();
        return gson.parseList(json);
    }


}
