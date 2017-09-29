package com.zihan.demo.dao.mappers;

import com.zihan.demo.model.User;

import java.util.List;

/**
 * Created by zihanxu on 2017/9/20.
 */
public interface UserMapper {
    List<User> selectUserByUid(long uid);
}
