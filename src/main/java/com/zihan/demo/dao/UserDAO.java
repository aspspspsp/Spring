package com.zihan.demo.dao;

import com.zihan.demo.dao.mappers.UserMapper;
import com.zihan.demo.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by zihanxu on 2017/8/18.
 */
@Repository
public class UserDAO {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(long userId) {
        return userMapper.selectUserByUid(userId);
    }

    public User getUserByUsername(String username) {
        return userMapper.selectUserByUsername(username);
    }
}