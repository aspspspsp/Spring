package com.zihan.demo.model;

import lombok.Data;

/**
 * Created by zihanxu on 2017/8/18.
 */
@Data
public class User {
    private final long uid;
    private final String username; //帳號
    private final String password; //密碼
    private final String email; //電子郵件
    private final String headImg; //使用者大頭貼
    private final String nickName; //暱稱
}