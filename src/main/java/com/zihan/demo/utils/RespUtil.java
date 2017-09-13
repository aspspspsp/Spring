package com.zihan.demo.utils;

import com.sun.org.apache.bcel.internal.classfile.Code;
import com.zihan.demo.response.Resp;

/**
 * Created by zihanxu on 2017/9/13.
 */
public class RespUtil {
    public static <T> Resp<T> ok(T t) {
        Resp<T> resp = new Resp<T>();
        resp.setCode(CodeEnum.OK.getCode());
        resp.setMsg(CodeEnum.OK.getMsg());
        resp.setData(t);

        return resp;
    }

    public static Resp fail(int code, String msg) {
        Resp resp = new Resp();
        resp.setCode(code);
        resp.setMsg(msg);

        return resp;
    }

    public static <T> Resp<T> transResp(Resp<T> message, int successCode) {
        if(message.getCode() == successCode) {
            return ok(message.getData());
        }

        return message;
    }
}

