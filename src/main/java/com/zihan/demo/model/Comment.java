package com.zihan.demo.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by zihanxu on 2017/9/14.
 */
@Data
public class Comment {
    private final long id;
    private final long uid;
    private final String comment;
    private final Date date;
}
