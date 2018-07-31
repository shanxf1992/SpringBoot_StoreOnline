package com.itheima.mapper;

import com.itheima.pojo.User;
import org.springframework.stereotype.Repository;

@Repository("userMapper")
public interface UserMapper {

    public void register(User user);
}
