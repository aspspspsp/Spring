package com.zihan.demo.dao;

import com.zihan.demo.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zihanxu on 2017/8/18.
 */
@Repository
public interface UserDAO {
    @Select("")
    User getOneUser();
}
