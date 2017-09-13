package com.zihan.demo.model;

import lombok.Data;

/**
 * Created by zihanxu on 2017/8/18.
 */
@Data
public class Member {
    private final long uid;
    private final String username;
    private final String password;
}
