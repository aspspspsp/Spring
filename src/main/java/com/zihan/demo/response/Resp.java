package com.zihan.demo.response;

import lombok.Data;

/**
 * Created by zihanxu on 2017/9/13.
 */
@Data
public class Resp<T> {
    private int code;
    private String requestId;
    private String msg;
    private T data;
}
