package com.zihan.demo.model;

import lombok.Data;

/**
 * 訂閱
 * Created by zihanxu on 2017/9/14.
 */
@Data
public class Subscriber {
    private final Long id;
    private final String movieName;
    private final String userName;
    private final String nickName;
}
